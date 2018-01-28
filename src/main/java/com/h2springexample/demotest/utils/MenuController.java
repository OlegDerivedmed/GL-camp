package com.h2springexample.demotest.utils;

import java.util.Scanner;

public final class MenuController {

    private static Scanner scanner = new Scanner(System.in);

    private MenuController() {

    }

    public static String runMenu(){
        String input;
        while (true){
            System.out.println("Please select one of the following.");
            System.out.println("1. Calculate the total capacity and carrying capacity of all the aircraft in the airline.");
            System.out.println("2. Display the list of aircraft of the company sorted by flight range.");
            System.out.println("3. Find airplanes corresponding to a given range of fuel consumption parameters.");
            System.out.println("To end application type 'end'.");
            input = scanner.next();
            if ("1".equals(input)||"2".equals(input)||"3".equals(input)||"end".equals(input)) break;
            System.out.println("Enter valid choice");
        }
        return input;
    }
}
