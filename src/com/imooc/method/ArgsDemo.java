package com.imooc.method;
/**
 * 关于可变参数列表和重载的问题
*
* */
public class ArgsDemo {
    public void sum(int ...n){
        int sum = 0;
        for(int a:n){
            sum += a;
        }
        System.out.println("可变参数的方法，输入数字的和是： " + sum);
    }
    private int sum(int a, int b){
        int sum = 0;
        sum = a + b;

        System.out.println("不可变参数的方法" + sum);
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo ad = new ArgsDemo();
        ad.sum(1);
        ad.sum(1,2);
        ad.sum(1,2,3,4);
        int[] a = {1,2,3,4,5};
        ad.sum(a);
    }
}
