package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SpringBootApplication
@ConfigurationPropertiesScan()
public class DemoApplication {

    public static void main(String[] args) {
      var context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }

}