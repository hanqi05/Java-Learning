package com.hanqi.learn.day04;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 23, 99, 34};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            if (arr[i] < min) {
                int temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        System.out.println("最大值为：" + max + " 最小值为：" + min);
    }
}
