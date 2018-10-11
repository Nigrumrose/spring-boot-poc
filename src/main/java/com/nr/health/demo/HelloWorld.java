package com.nr.health.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/home")
    String hello() {
        return "Hello World! JavaInterviewPoint";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}
