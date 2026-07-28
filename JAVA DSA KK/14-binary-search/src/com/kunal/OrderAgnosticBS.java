package com.kunal;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 1, 2, 3, 4, 5, 10, 16, 18, 22, 45};
        int[] arr = {45, 22, 18, 16, 10, 5, 4, 3, 2, 1, -4, -12, -18};
        int target = 5;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            // find the middle element
            // int mid = (start+end)/2;   // might be possible that (start=end)/2 exceeds the range of integer in java
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){                  // Ascending
                if(target<arr[mid]){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            } else { // Descending
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}