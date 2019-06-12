package com.example.HelloWorld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

    @RequestMapping("/Welcom")
    public String home(){
        return "welcom controller";
    }
}
