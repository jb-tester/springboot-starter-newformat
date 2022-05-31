package com.mytests.spring.boot.sbNewFormatBundlesUsage;

import com.mytests.spring.boot.sbNewFormatBundle1.AutoConfigureMyBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@AutoConfigureMyBeans
public class SbNewformatBundlesUsageApplication implements CommandLineRunner {
@Autowired
ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(SbNewformatBundlesUsageApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
UsageService usageService = ctx.getBean(UsageService.class);
usageService.display();
    }
}
