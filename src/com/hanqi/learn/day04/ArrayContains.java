package com.hanqi.learn.day04;

public class ArrayContains {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int num = 33;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                flag = true;
                break;
            }
        }
        if( flag){
            System.out.println("数组中包含"+num);
        }else{
            System.out.println("数组中不包含"+num);
        }
    }
}
