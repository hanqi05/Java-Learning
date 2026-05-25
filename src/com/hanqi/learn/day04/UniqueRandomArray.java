package com.hanqi.learn.day04;

import java.util.Random;

public class UniqueRandomArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = random.nextInt(0, 101);
            boolean flag = true;
            for (int j = 0; j <i; j++) {
                if (arr[j] == num) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[i] = num;
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
