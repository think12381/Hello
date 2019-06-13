package com.example.HelloWorld.Controller;

import com.example.HelloWorld.Service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    private Message message;

    @RequestMapping("/hello1")
    public Message home(){

        //Message message = new Message();
        //message.setId(888);
        //message.setName("Mark");
        return message;
    }

}
