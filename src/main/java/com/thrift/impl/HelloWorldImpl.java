package com.thrift.impl;

import org.apache.thrift.TException;

/**
 * Created by Ivan on 2016/6/1.
 */
public class HelloWorldImpl implements HelloWorldService.Iface {
    public HelloWorldImpl() {
    }

    @Override
    public String sayHello(String username) throws TException {
        return "Hi," + username + " welcome to my blog www.micmiu.com";
    }
}
