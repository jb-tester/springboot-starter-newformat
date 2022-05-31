package com.mytests.spring.boot.sbNewFormatBundle1;

/**
 * *
 * <p>Created by irina on 5/31/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
public class MyBean2 {
    private final String s;

    public MyBean2(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
