package com.example.HelloWorld.Calculater;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="add")
    Caculator add(){
        return new AddCalu();
    }

    @Bean(name="sub")
    Caculator Sub(){
        return new SubCalu();
    }

    @Bean(name="mul")
    Caculator Mul(){
        return new MulCalu();
    }

    @Bean(name="div")
    Caculator Div(){
        return new DivCalu();
    }
}
