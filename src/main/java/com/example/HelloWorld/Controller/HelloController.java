package com.example.HelloWorld.Controller;

import com.example.HelloWorld.Message;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public Message home(){

        Message message = new Message();
        message.setId(888);
        message.setName("Mark");
        return message;
    }

}
