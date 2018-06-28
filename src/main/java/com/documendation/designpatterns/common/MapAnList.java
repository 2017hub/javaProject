package com.documendation.designpatterns.common;

import java.util.HashMap;
import java.util.Map;

public class MapAnList {
    public static  void main(String[] args){
        sortMap();
    }

    /**
     * map集合的遍历
     */
    public static  void sortMap(){
        Map<String,Object> maps=new HashMap<>();
        maps.put("key1","long");
        maps.put("key2","wenjie");
        maps.put("key3","zhang");
        System.out.println("--->"+maps.size());
        for (Map.Entry<String,Object> entry:maps.entrySet()) {
            System.out.println("---->"+entry.getKey()+"---- "+entry.getValue());
        }
    }
}
