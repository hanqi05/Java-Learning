package com.hanqi.learn.day04;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55, 33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int num = sc.nextInt();
        boolean flag = false;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "找到了,下标是" + i);
        } else {
            System.out.println("没有找到");
        }
    }
}
