package com.imooc.flow1;

public class PlusDemo {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (n <= 10) {
            sum = sum + ++n;
        }
        System.out.println("1-5的累加值是： " + sum);
    }
}
