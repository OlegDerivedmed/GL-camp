package com.h2springexample.demotest.menu;

public class MenuOptionTwoMaker implements MenuOptionMaker {
    public MenuOption getMenuoption() {
        return MenuOptionTwo.getInstance();
    }
}
