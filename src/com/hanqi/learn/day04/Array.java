package com.hanqi.learn.day04;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(1, 15);
            boolean flag = false;
            arr[i]=randomIndex;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]){
                    continue;
                }else{
                    flag = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
