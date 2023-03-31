package com.mytests.spring.boot.sbNewFormatBundlesUsage;

import com.mytests.spring.boot.sbNewFormatBundle1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 3/17/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
@Service

public class UsageService {

    // configurations mentioned in file org.springframework.boot.autoconfigure.AutoConfiguration.imports
    // configurations imported by above configs
    // and beans defined by these configurations:
    @Autowired MainConfig1 mainConfig1;
    @Autowired MainConfig2 mainConfig2;
    @Autowired ImportedConfig1 importedConfig1;
    @Autowired BundleBean1 bundleBean1;
    @Autowired BundleBean2 bundleBean2;
    @Autowired BundleBean3 bundleBean3;


    // configuration defined in custom file com.mytests.spring.boot.sbNewFormatBundle1.AutoConfigureMyBeans.imports
    // and beans defined by this config
    // should be available if the @com.mytests.spring.boot.sbNewFormatBundle1.AutoConfigureMyBeans annotation is present
    @Autowired
    MyBeansConfiguration myBeansConfiguration;
    @Autowired
    MyBean1 mb1;
    @Autowired
    MyBean1 mb2;


    @Autowired
    private Compo compo;


    public void display(){
        System.out.println("--- from default config: ");
        System.out.println(bundleBean1);
        System.out.println(bundleBean2);
        System.out.println(bundleBean3);
        System.out.println("--- from custom config enabled by @AutoConfigureMyBeans: ");
        System.out.println(mb1);
        System.out.println(mb2);

    }
}
