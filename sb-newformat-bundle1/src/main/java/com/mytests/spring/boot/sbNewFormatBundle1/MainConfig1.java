package com.mytests.spring.boot.sbNewFormatBundle1;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@AutoConfiguration("mainConfig")
@Import(ImportedConfig1.class)
@EnableConfigurationProperties(Bundle1ConfigProps.class)
public class MainConfig1 {

    @Bean
    public BundleBean1 bundleBean1() {
        return new BundleBean1("from  @AutoConfiguration-annotated MainConfig1");
    }
}
