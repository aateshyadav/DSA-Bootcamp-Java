package com.kunal;

public class Overloading {
    static void main(String[] args) {
        fun(67);
        fun("kunal kushwaha");
    }

    static void fun(int a ){
        // first one
        System.out.println(a);
    }

    static void fun(String name ){
        // second one
        System.out.println(name);
f
    }
}
