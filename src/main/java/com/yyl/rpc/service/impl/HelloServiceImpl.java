package com.yyl.rpc.service.impl;

import com.yyl.rpc.service.HelloService;

/**
 * Created by Administrator on 2017/3/10.
 */
public class HelloServiceImpl implements HelloService {
    public String hello(String name) {
        return "Hello "+name;
    }
}
