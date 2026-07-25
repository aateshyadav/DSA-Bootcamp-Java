package com.kunal;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,-5,-4,-3,-2,-1,0};
        int target=5;
        int ans = linearSearch(nums,target,1,6);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = start; index <= end; index++){
            // check for element ar=t every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
