package three.three;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StringDemo5 {
    public static void main(String[] args) {
//        String str1 = "imooc";
//        String str2 = "imooc";
//        String str3 = new String("imooc");
//        String str4 = new String("imooc");
//        System.out.println("str1==str2" + str1.equals(str2));
//        System.out.println("str1==str3: " +  str1.equals(str3));
//        System.out.println("str4==str3: " +  str4.equals(str3));
//        System.out.println("str1和str2地址是否相同？" + (str1==str2));
//        System.out.println("str1和str3地址是否相同？" + (str1==str3));
//        System.out.println("str3和str4地址是否相同？" + (str4==str3));
        String str1 = new String("Hello");
        String str2 = "Hello";
        System.out.println(str1.concat(str2));
        System.out.println(str1);
        System.out.println("str1==str2的结果是1: " + str1==str2);
        System.out.println("str1.equals(str2)的结果是: " + str1.equals(str2));
    }

}
