package com.kunal;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,-5,-4,-3,-2,-1};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
