package com.grainmarket.member.feign;

import com.grainmarket.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("GrainMarket-Coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
