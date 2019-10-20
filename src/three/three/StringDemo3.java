package three.three;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = new String("JAVA 基础 编程");
        byte[] arr = str.getBytes("UTF-8");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        String str2 = new String(arr, "UTF-8");
        System.out.println("********************");
        System.out.println(str2);
    }
}
