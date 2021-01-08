package com.atguigu.springbootmavenproject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public Map<String,Object> getUserMap(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("k1","v1");
        map.put("k2","v2");
        return map;
    }

    @RequestMapping("/one")
    public Map<String,Object> getUserMapOne(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("chaike","haha");
        map.put("sss","www");
        return map;
    }
}
