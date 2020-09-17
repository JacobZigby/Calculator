package com.Jacob;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        double value1, value2;
        //This scanner will be your keyboard input reader
        Scanner keyboardInput = new Scanner(System.in);

        //Here we initalize the calculator
        Calculator cal = new Calculator();

        //A little introduction to your program
        System.out.println("Welcome to your calculator program");

        System.out.println("This will be a very simple demonstration");
        System.out.println("Let us add two values together and see the results");

        System.out.print("Please insert vlaue1: ");

        value1 = keyboardInput.nextDouble();

        System.out.print("Please insert vlaue2: ");

        value2 = keyboardInput.nextDouble();

        System.out.println();

        System.out.println("Result: " + cal.sum(value1, value2));


    }
}
