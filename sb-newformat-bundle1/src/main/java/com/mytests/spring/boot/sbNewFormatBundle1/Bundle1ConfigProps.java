package com.mytests.spring.boot.sbNewFormatBundle1;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 3/17/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
@ConfigurationProperties("bundle1")
public class Bundle1ConfigProps {
    Boolean prop1;

    public Boolean getProp1() {
        return prop1;
    }

    public void setProp1(Boolean prop1) {
        this.prop1 = prop1;
    }
}
