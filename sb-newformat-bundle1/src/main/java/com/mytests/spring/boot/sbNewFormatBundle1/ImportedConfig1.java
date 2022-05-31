package com.mytests.spring.boot.sbNewFormatBundle1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 3/17/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
@Configuration @ConditionalOnProperty(name = "bundle1.prop1", havingValue = "true")
public class ImportedConfig1 {

    @Bean
    public BundleBean2 bundleBean2() {
        return new BundleBean2("from imported @Configuration-annotated class; conditional on bundle1.props == true");
    }
}
