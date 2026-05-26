package com.hanqi.learn.day04;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
