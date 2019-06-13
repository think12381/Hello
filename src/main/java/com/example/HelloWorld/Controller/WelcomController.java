package com.example.HelloWorld.Controller;

import com.example.HelloWorld.Service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

    @Autowired
    private Message message;

    @RequestMapping("/Welcom")
    public Message bar(){
        return message;
    }
}
