package com.grainmarket.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.grainmarket.coupon.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.*;

import com.grainmarket.coupon.entity.CouponEntity;
import com.grainmarket.coupon.service.CouponService;
import com.grainmarket.common.utils.PageUtils;
import com.grainmarket.common.utils.R;



/**
 * 优惠券信息
 *
 * @author Echo Wang
 * @email wangshicheng1995@gmail.com
 * @date 2022-01-16 10:57:00
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;
    @Autowired
    private TestEntity testEntity;

    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @GetMapping("show")
    public Object show() {
        return this.testEntity;
    }

    @RequestMapping("/test")
    public R testGetConfigFromApplicationProperties() {
        return R.ok().put("name", name).put("age", age);
    }

    /**
     * 获取会员的所有优惠券信息（Feign)
     *
     * @author echo
     * @date 2022/2/24
     * @return com.grainmarket.common.utils.R
     */
    @RequestMapping("/member/list")
    public R memberCoupons() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满 100 减 10 优惠券");
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
