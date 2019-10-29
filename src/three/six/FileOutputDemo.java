package three.six;

import com.imooc.model.Subject;

import java.io.*;

public class FileOutputDemo {
    public static void main(String[] args) {
        File file = new File("./src/tmp.txt");
        boolean flag = file.exists();
        //路径为java目录
        System.out.println(FileOutputStream.class.getResource("/"));
        System.out.println("文件是否存在： "+ flag);
        if(file.exists()){
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("./src/tmp.txt");
                FileInputStream fis = new FileInputStream("./src/tmp.txt");
                fos.write(50);
                fos.write('a');
//                System.out.println(fis.read());
                System.out.println((char)fis.read());
                System.out.println((char)fis.read());
                byte[] b = new byte[50];
                fis.read(b);
                System.out.println(new String(b));
                fos.close();
                fis.close();;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
