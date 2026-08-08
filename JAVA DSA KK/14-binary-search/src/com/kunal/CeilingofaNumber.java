package com.kunal;

public class CeilingofaNumber {   // smallest number greater than or equal to target
    static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceilingofanumber(arr, target);
        System.out.println(ans);
    }
    static int ceilingofanumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            // Find the middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // target == arr[mid]
                return arr[mid];
            }
        }
        // start points to the smallest element
        // greater than the target
//        if (start < arr.length) {
//            return arr[start];
//        }
        // Ceiling does not exist
        return arr[start];
    }
}
