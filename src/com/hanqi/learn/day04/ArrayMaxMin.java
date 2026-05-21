package com.hanqi.learn.day04;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55,1,11};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max){
               int temp = max;
               max=arr[i];
               arr[i] = temp;
           }
           if (arr[i] < min){
               int temp = min;
               min=arr[i];
               arr[i] = temp;
           }
        }
        System.out.println("最大值为："+max+" "+"最小值为："+min);


    }
}
