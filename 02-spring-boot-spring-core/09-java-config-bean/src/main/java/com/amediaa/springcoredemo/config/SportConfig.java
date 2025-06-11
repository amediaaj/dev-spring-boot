package com.amediaa.springcoredemo.config;

import com.amediaa.springcoredemo.common.Coach;
import com.amediaa.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // @Bean use case: Take existing third-party
    //  class and expose as a Spring bean
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
