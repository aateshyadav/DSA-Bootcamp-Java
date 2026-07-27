package com.kunal;

public class EvenDigits {
    static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] arr){
        int count=0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){ // counting numbers having even number of digits
        int numberOfDigits = digits(num);
//        if (numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;
    }
//    static int digits(int num){ // counting numbers at individual index
//        int count = 0;
//        while(num>0){
//            count++;
//            num/=10;   // num=num/10;
//        }
//        return count;
//    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }
}
