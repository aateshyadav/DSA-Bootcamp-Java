package com.kunal;

import java.util.Scanner;

public class Greeting {
    static void main(String[] args) {
//        greeting();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String naam = in.next();
        String personalised =  greeting(naam);
        System.out.println(personalised);

    }
    
    static String greeting(String name){
        String message = "Hello " + name;
        return message;
    }
}
