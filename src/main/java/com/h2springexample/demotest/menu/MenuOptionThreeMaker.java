package com.h2springexample.demotest.menu;

public class MenuOptionThreeMaker implements MenuOptionMaker {
    public MenuOption getMenuoption() {
        return MenuOptionThree.getInstance();
    }
}
