package com.hanqi.learn.day05;

public class Method {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int from = 1;
        int to=8;
        int[] newArr = arrayCopy(arr, from, to);//
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }

    public static int[] arrayCopy(int[] arr, int from, int to){
        int[] newArr = new int[to-from];//创建一个新数组
        for (int i = from, j = 0; i < to; i++, j++) {
            //j 是新数组的索引
           newArr[j]=arr[i];
        }
        return newArr;
    }

}
