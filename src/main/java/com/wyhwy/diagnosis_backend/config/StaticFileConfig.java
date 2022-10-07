package com.wyhwy.diagnosis_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class StaticFileConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("file:uploadFile/");
        super.addResourceHandlers(registry);
    }
    
}
