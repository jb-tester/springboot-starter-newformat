package com.mytests.spring.boot.sbNewFormatBundle1;

/**
 * *
 * <p>Created by irina on 3/17/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
public class BundleBean2 {


    private final String id;

    public BundleBean2(String s) {
        this.id = s;
    }

    @Override
    public String toString() {
        return "BundleBean2 " + id ;
    }
}
