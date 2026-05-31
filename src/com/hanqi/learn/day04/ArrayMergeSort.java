package com.hanqi.learn.day04;

public class ArrayMergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i]=arr2[i];
        }

        for (int i = 0; i < newArr.length-1; i++) {
            for (int j = 0; j < newArr.length-1-i; j++) {
                if (newArr[j]>newArr[j+1]){
                    int temp = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = temp;
                }
            }
        }


        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
