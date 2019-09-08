package com.imooc;

public class FloatDemo {
   public static void main(String[] args){
        float f = 1234.324f;
        char a = 'a';
        char ch = 122;
//        for (int i=0;i<66;i++){
//            System.out.println((char)i);
//        }
       char c = '\u005d';
       System.out.println("c="+c);
       String s = "I am Harry!";
       System.out.println("s="+s);
       double d =123E5;
       System.out.println(d);
       float f1 =123e5f;
       System.out.println(f1);
       double d1 = 123.4;
       int a1 = (int) d1;
       a1 += 5;
       System.out.println("a1+5=" + --a1);
       System.out.println("f=" + f + '/' + a + '/' + ch);
    }
}
