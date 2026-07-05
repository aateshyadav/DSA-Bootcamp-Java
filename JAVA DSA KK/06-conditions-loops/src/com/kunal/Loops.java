package com.kunal;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
        // for loops
        // Q: print numbers one to five

        //int i;
//        for(int i=1;i<=5;i+=1){
//            System.out.println(i);
//        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            System.out.println("hello world");
//        }

        // while loops
        /*
        Syntax:
        while(condition){
        // body
        }
         */

//        int i=1;
//        while(i<=n){
//            System.out.println(i);
//            i += 1;
//        }

        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}





















