package com.kunal;

public class MaxWealth {
    static void main(String[] args) {
        int[][] arr;
        arr=new int[][]{
            {1,2,3},
            {1,4,5},
            {5,5,5}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
//        for(int person = 0; person < accounts.length; person++){
//            // when you start a new col, take a new sum for that row
//            int sum = 0;
//            for(int account = 0; account < accounts[person].length; account++){
//                sum += accounts[person][account];
//            }
//            // now we have sum of accounts of person
//            // check with overall ans
//            if(sum > ans){
//                ans=sum;
//            }
//        }
        for (int[] ints : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
