package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@EnableAutoConfiguration
public class GreetingController implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Autowired
    @Qualifier("add")
    private Caculator addcalu;

    @Autowired
    @Qualifier("mul")
    private Caculator Mulcalu;

    @Autowired
    @Qualifier("sub")
    private Caculator Subcalu;


    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name",required = false,defaultValue = "world456")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";

    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("auto wire add result   " + addcalu.calu(1,2));
        System.out.println("auto wire mul result   " + Mulcalu.calu(1,2));
        System.out.println("auto wire sub result   " + Subcalu.calu(1,2));

        Caculator Divcalu = context.getBean("div",Caculator.class);

        System.out.println("get bean result   " + Divcalu.calu(2,1));

    }
}
