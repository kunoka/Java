package com.imooc.method;

public class MethodDemo {
     void printStar(){
        System.out.println("**************************");

    }
    public static void main(String[] args) {
        MethodDemo myMethodDemo = new MethodDemo();
        myMethodDemo.printStar();
        System.out.println("欢迎来到JAVA的世界");
        myMethodDemo.printStar();
    }
}
