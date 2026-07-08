package com.kunal;
import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
//        int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.print("नमस्ते");  // unicode values

//        System.out.print(3 * 6.55);

        byte b = 42;
        char c = 'a';
        short s =1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234d;

        double result = (f*b)+(i/c)-(d-s);   // float + int - double = double
        System.out.println(result);

        System.out.println((f * b) + " " + (i/c) + " " + (d-s));

    };

}