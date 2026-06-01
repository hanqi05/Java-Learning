package com.hanqi.learn.day05;

public class Method {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int target = 2;
        deleteArray(arr,target);

    }
    public static void deleteArray(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
