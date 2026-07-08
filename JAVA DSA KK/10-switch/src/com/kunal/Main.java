package com.kunal;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // METHOD 1
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("round orange colour fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("unknown fruit");
                break;

            // METHOD 2
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("round orange colour fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("unknown fruit");

            // METHOD 3
//        if (fruit.equals("mango")) {
//            System.out.println("king of fruits");
//        } else if (fruit.equals("apple")) {
//            System.out.println("a sweet red fruit");
//        } else if (fruit.equals("orange")) {
//            System.out.println("round orange colour fruit");
//        } else if (fruit.equals("grapes")) {
//            System.out.println("small fruit");
//        } else {
//            System.out.println("unknown fruit");
        }
    }
}
