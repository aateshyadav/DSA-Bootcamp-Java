package com.kunal;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(10,20,30);
        System.out.println(ans);
    }

    static int sum3(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    };

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;
        return sum;
        // System.out.println("hello"); -> Nothing run after this
    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
