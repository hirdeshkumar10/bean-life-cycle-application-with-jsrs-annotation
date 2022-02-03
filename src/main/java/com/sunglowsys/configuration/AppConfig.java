package com.sunglowsys.configuration;

import com.sunglowsys.service.HotelService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sunglowsys.configuration")
public class AppConfig {
    @Bean
    public HotelService getHotelService(){
        return  new HotelService();
    }
}
