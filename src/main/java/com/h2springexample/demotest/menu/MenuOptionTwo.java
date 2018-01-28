package com.h2springexample.demotest.menu;


import com.h2springexample.demotest.entities.Plane;
import com.h2springexample.demotest.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class MenuOptionTwo implements MenuOption {
    @Autowired
    PlaneService planeService;
    private static MenuOptionTwo ourInstance = new MenuOptionTwo();

    public static MenuOptionTwo getInstance() {
        return ourInstance;
    }

    private MenuOptionTwo() {
    }

    public void getResponse() {
        for (Plane plane :
                planeService.sortedByFlightRange()) {
            System.out.println(plane.toString());
        }
    }
}
