package com.h2springexample.demotest.menu;

public class MenuOptionOneMaker implements MenuOptionMaker {
    public MenuOption getMenuoption() {
        return MenuOptionOne.getInstance();
    }
}
