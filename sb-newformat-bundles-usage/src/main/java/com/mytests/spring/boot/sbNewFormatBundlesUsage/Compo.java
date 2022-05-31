package com.mytests.spring.boot.sbNewFormatBundlesUsage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 4/5/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
@Component
public class Compo {

    @Value("Compo")
    String id;

    public String getId() {
        return id;
    }
}
