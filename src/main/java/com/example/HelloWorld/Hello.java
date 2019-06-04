package com.example.HelloWorld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Hello {

    @RequestMapping("/Hello")
    String home(){
        return "hello ";
    }
}
