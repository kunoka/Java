package three.six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/putao/Desktop/2019/study/java/src/three/six/imooc.txt");
            byte[] b = new byte[20];
            fis.read(b);
            fis.read(b, 0, 5);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
