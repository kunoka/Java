package three.six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/putao/Desktop/2019/study/java/src/three/six/imooc.txt");
            int n = 0;
            while ((n = fis.read()) != -1) {
                System.out.print((char) n);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
