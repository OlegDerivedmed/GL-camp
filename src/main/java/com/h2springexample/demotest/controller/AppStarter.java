package com.h2springexample.demotest.controller;

import com.h2springexample.demotest.menu.MenuOptionFactory;
import com.h2springexample.demotest.utils.MenuController;
import org.springframework.beans.factory.annotation.Autowired;

public class AppStarter {
    @Autowired
    MenuOptionFactory menuOptionFactory;

    public void appStart(){
        while (true){
            String option = MenuController.runMenu();
            if ("end".equals(option)){
                System.exit(0);
            }
            menuOptionFactory.setMenuOption(option);
            menuOptionFactory.getMenuOption().getResponse();
        }
    }
}
