package com.kunal;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>( 10);
//        list.add(67);
//        list.add(234);
//        list.add(10);
//        list.add(632);
//        list.add(9630);
//        list.add(220);
//        list.add(390);
//        list.add(980);
//        list.add(790);
//
//        //System.out.println(list.contains(9630));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        // input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
         // get item at any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(i) + " ");   // pass index here, list[index] syntax will not work here
        }
    }
}
