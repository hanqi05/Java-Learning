package com.hanqi.learn.day02;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入使用电量(单位：°)");
        int usage= sc.nextInt();
        double cost=0;
        if(usage>=0){
            if(usage<100){
                cost=usage*0.5;
            }else if(usage<=200){
                cost=(usage-100)*0.8+100*0.5;
            }else {
                cost=(usage-200)*1.2+100*0.5+100*0.8;
            }
            System.out.println("电费为："+cost+"元");
        }else{
            System.out.println("error");
        }
    }
}
