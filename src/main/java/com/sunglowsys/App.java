package com.sunglowsys;

import com.sunglowsys.configuration.AppConfig;
import com.sunglowsys.service.HotelService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HotelService hotelService = context.getBean(HotelService.class);
        hotelService.send("hi friends");

        HotelService hotelService1 = context.getBean(HotelService.class);
        hotelService1.send("hi how are u");

        context.close();

    }
}
