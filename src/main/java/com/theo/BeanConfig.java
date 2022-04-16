package com.theo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.theo")
public class BeanConfig {

    // to define a bean
    @Bean
    public Profile profile(){
        return new Profile();
    }

    @Bean
    public Student student(){
        return new Student("UZ");
    }
}
