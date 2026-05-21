package com.hanqi.learn.day04;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55,1,11};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max){
               max=arr[i];
           }
           if (arr[i] < min){
               min=arr[i];
           }
        }
        System.out.println("最大值为："+max+" "+"最小值为："+min);


    }
}
