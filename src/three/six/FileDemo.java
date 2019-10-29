package three.six;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/putao/Desktop/2019/");
        File file1 = new File(file, "study/java/src/tmp.txt");
        System.out.println(file.isDirectory());
        System.out.println(file1.isFile());
        // 创建目录
        File file2 = new File("/Users/putao/Documents/set/hashset");
        if(!file2.exists()){
            file2.mkdirs();
        }
        // 创建文件
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
