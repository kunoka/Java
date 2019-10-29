package three.six;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/three/six/imooc.txt");
            FileOutputStream fos = new FileOutputStream("./src/three/six/imooc1.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            int n = 0;
            char[] cbuf = new char[10];
            //第一种输出方法
//            while((n=isr.read())!=-1){
//                System.out.print((char)n);
//            }
//            System.out.println();
//            System.out.println("*********第二种方法*********");
//            //第二种方法
//            while ((n = isr.read(cbuf)) != -1) {
//                String s = new String(cbuf, 0, n);
//                System.out.println(s);
//            }
            while ((n = isr.read(cbuf)) != -1) {
                System.out.print((char) n);
                osw.write(cbuf, 0, n);
                osw.flush();
            }
            fis.close();
            fos.close();
            isr.close();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
