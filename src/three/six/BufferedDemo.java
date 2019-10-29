package three.six;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./src/three/six/imooc.txt", true);
            FileInputStream fis = new FileInputStream("./src/three/six/imooc.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            BufferedInputStream bis = new BufferedInputStream(fis);

            bos.write(50);
            bos.write('a');
            bos.flush();
            bos.close();
            System.out.println(bis.read());
            System.out.println((char) bis.read());
            fos.close();
            fis.close();
            bos.close();
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
