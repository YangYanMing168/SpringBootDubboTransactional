package com.provider;

import com.service.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
