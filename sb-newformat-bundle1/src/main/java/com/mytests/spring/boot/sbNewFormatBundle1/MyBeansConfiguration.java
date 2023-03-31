package com.mytests.spring.boot.sbNewFormatBundle1;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 5/31/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * <p> This configuration defines the beans that should be available</p>
 * <p> if @AutoConfigureMyBeans annotation is present </p>
 */
//@AutoConfiguration
public class MyBeansConfiguration {

    @Bean
    public MyBean1 myBean1() {
        return new MyBean1("mybean1 available if @AutoConfigureMyBeans annotation is present");
    }
    @Bean
    public MyBean2 myBean2() {
        return new MyBean2("mybean2 available if @AutoConfigureMyBeans annotation is present");
    }
}
