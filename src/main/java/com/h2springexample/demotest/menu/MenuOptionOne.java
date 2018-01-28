package com.h2springexample.demotest.menu;

import com.h2springexample.demotest.entities.Plane;
import com.h2springexample.demotest.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuOptionOne implements MenuOption {
    @Autowired
    PlaneService planeService;

    private int totalCapaciti;
    private int totalCarryingCapaciti;
    private static MenuOptionOne ourInstance = new MenuOptionOne();

    public static MenuOptionOne getInstance() {
        return ourInstance;
    }

    private MenuOptionOne() {
    }

    public void getResponse() {
        for (Plane plane :
                planeService.findAll()) {
            totalCarryingCapaciti += plane.getCARRYINGCAPACITI();
            totalCapaciti += plane.getCapaciti();
        }
        System.out.println("Total capaciti = " + totalCapaciti + " Watt");
        System.out.println("Total carrying capaciti = " + totalCarryingCapaciti + " Tons");
    }
}
