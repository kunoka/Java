package three.six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/three/six/happy.jpg");
            FileOutputStream fos = new FileOutputStream("./src/three/six/happycopy.jpg");
            int n = 0;
            byte[] b = new byte[1024];
            while ((n = fis.read(b)) != -1) {
                fos.write(b, 0, n);
            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
