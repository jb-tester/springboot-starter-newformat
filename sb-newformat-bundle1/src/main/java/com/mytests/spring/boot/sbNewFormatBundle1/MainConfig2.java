package com.mytests.spring.boot.sbNewFormatBundle1;

import org.springframework.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 5/31/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
//@Configuration
public class MainConfig2 {

    @Bean
    public BundleBean3 bundleBean3() {
        return new BundleBean3("from  @AutoConfiguration-annotated MainConfig2");
    }

}
