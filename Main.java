package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//LAB ASSIGNMENT
        // Tested creating a string with nothing assigned
        //When compiled, gave illegal start of expression error
//        String thisString = ;
//        System.out.println(thisString);

        // Tested creating with an invalid character in name
        // Got  ';' expected error
//        int excitedNumber! = 1;

        // Tested declaring string without initializing
        // Got Variable might not have been initialized error
//    String nothingHere;
//    System.out.println(nothingHere);

        // Tested declaring a string variable in nested state
        // Got java cannot find symbol error, because scope is only inside of conditional
//        int isOne = 1;
//        if (isOne == 1) {
//            String thisOne = "This is One.";
//        }
//        System.out.println(thisOne);

        // Tested reassigning as a string
        // Got incompatible types error - java.lang.String cannot be converted to int
//        var warningCount = 5;
//        warningCount = "6";

// SLIDES ASSIGNMENT
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your favorite animal?");
        String animal = userInput.nextLine();

        if (animal.equals("cat")) {
            System.out.println("Meowwww");
        }
        if (animal.equals("dog")) {
            System.out.println("Woof woof");
        }

        if (animal.equals("cow")) {
            System.out.println("Mooooooo");
        }

        if (animal.equals("bird")) {
            System.out.println("Tweet tweet");
        }
        if (animal.equals("pig")) {
            System.out.println("Squeeeeee");
        }
        else {
            System.out.println("I don't know what sound that animal makes!");
        }
    }
}
