package com.example.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name",required = false,defaultValue = "world456")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";

    }
}
