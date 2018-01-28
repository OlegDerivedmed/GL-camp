package com.h2springexample.demotest.controller;

import com.h2springexample.demotest.menu.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationController {
    @Bean
    MenuOptionFactory getMenuOptionFactory(){
        return new MenuOptionFactory();
    }

    @Bean
    AppStarter getAppStarter(){
        return new AppStarter();
    }

    @Bean
    MenuOptionOne getMenuOptionOne(){
        return MenuOptionOne.getInstance();
    }

    @Bean
    MenuOptionTwo getMenuOptionTwo(){
        return MenuOptionTwo.getInstance();
    }

    @Bean
    MenuOptionThree getMenuOptionThree(){
        return MenuOptionThree.getInstance();
    }
}
