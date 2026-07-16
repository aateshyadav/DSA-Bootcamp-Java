package com.kunal;

public class Scope {
    static void main(String[] args) {
       // int a = 10;    // intialising
        int b = 20;
        String name = "kunal";
        {
            int a=99;     // updating
            name = "rahul";
        }
        
        int a =100;
        System.out.println(a);
        System.out.println(name);
    }
    
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
