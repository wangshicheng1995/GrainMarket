package com.grainmarket.member.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author echo
 * @version 1.0
 * @date 2022/4/18 21:04
 */
public class MySelectImportor implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com/grainmarket/member/entity/MemberEntity"};
    }
}
