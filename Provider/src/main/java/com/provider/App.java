package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource(value = "classpath:dubbo.xml")
public class App {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
        System.in.read();
    }
}
