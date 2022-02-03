package com.sunglowsys.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

public class HotelService {
    private Map<String, String> map = null;

    public HotelService(){
        map = new HashMap<>();
    }
    public void send(String mailTo){
        System.out.println("Inside send methode:"+mailTo);
    }
    @PostConstruct
    public void init(){
        map.put("host", "hk@gmai.com");
        map.put("port", "4545");
        map.put("from", "kj@gmail.com");
        System.out.println("inside init method:"+map);
    }
    @PreDestroy
    public void destroy(){
        map.clear();
        System.out.println("inside destroy method:"+map);
    }
}
