package com.h2springexample.demotest.menu;


import com.h2springexample.demotest.entities.Plane;
import com.h2springexample.demotest.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MenuOptionThree implements MenuOption {
    @Autowired
    PlaneService planeService;
    private static MenuOptionThree ourInstance = new MenuOptionThree();

    public static MenuOptionThree getInstance() {
        return ourInstance;
    }

    private MenuOptionThree() {
    }

    public void getResponse() {
        Scanner scanner = new Scanner(System.in);
        int from;
        int to;
        while (true) {
            System.out.println("Enter range of fuel consumption.");
            String [] scanners = scanner.next().split("-");
            from = Integer.parseInt(scanners[0]);
            to = Integer.parseInt(scanners[1]);
            break;
        }
        for (Plane plane :
                planeService.findByRange(from, to)) {
            System.out.println(plane.toString());
        }
    }
}
