package com.h2springexample.demotest.menu;

public class MenuOptionFactory {
    private String option;
    MenuOptionMaker menuOptionMaker;

    public MenuOptionFactory(){
    }
    public void setMenuOption(String option) {
        this.option=option;
        if ("1".equals(option)) menuOptionMaker = new MenuOptionOneMaker();
        if ("2".equals(option)) menuOptionMaker = new MenuOptionTwoMaker();
        if ("3".equals(option)) menuOptionMaker = new MenuOptionThreeMaker();
    }

    public MenuOption getMenuOption(){
       return menuOptionMaker.getMenuoption();

    }

}
