package com.sonsumer;

import com.service.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:dubbo.xml")
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Hello hello = context.getBean(Hello.class);
        String sayHello = hello.sayHello("KamYang");
        System.out.println(sayHello);
        System.exit(0);
    }
}
