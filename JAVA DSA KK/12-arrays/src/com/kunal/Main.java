package com.kunal;

public class Main {
    static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "kunal kushwaha";

        // Q: store 5 roll numbers
//        int[] rnos = new int[5];
//        int[] rnos2 = {23,12,45,32,15};

        int[] ros; // declaration of an array. ros is getting defined in the stack
        ros = new int[5]; // initlisation: actually here objects is being created in the heap memory
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[1]);

    }
}
