package com.kunal;

public class Max {
    static void main(String[] args) {
       int[] arr={1,3,34,55,2};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal=arr[0];  // telling start point
        for(int i=0;i<arr.length;i++){     // range
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal=arr[start];  // telling start point
        for(int i=start;i<=end;i++){     // range assigned from start point to end point
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
