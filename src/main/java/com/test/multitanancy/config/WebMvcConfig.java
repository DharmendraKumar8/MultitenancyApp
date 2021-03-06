package com.test.multitanancy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.test.multitanancy.web.MultiTenancyInterceptor;



@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

 @Override
 public void addInterceptors(InterceptorRegistry registry) {
  registry.addInterceptor(new MultiTenancyInterceptor());
 }
}