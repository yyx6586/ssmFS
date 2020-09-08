package com.aloogn.common;

public class test {
    public static void main(String[] args){
        // 1 到 100 相加
        int sum = 0;
        for(int i = 1; i <= 100; i ++){
           sum += i;
        }
        System.out.println("sum = " + sum);

        // 1 到 10相乘
        int sum1 = 1;
        for(int i = 1; i <= 10; i++){
            sum1 *= i;
        }
        System.out.println("sum1 = " + sum1);

        // 冒泡排序
        int[] a = {28,10,30,25,68,12,45,8};
        for(int i = 0; i < a.length; i ++){
            for(int j = i + 1; j < a.length; j ++){
                if(a[i] > a[j]){
                   int b = 0;
                   b = a[i];
                   a[i] = a[j];
                   a[j] = b;
                }
            }
            System.out.println("a = " + a[i]);
        }
    }
}
