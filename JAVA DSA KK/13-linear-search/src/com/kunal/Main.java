package com.kunal;

public class Main {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,-5,-4,-3,-2,-1,0};
        int target=5;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index=0; index<arr.length; index++){
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