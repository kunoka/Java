package three.six.practice;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Goods goods1 = new Goods("G0001", "手机", 3000);
        System.out.println(goods1);
        File file = new File("./src/three/six/practice/tmp.txt");
        try {
            FileOutputStream fos = new FileOutputStream("./src/three/six/practice/tmp.txt");
            FileInputStream fis = new FileInputStream("./src/three/six/practice/tmp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ObjectInputStream ois = new ObjectInputStream(fis);
            oos.writeObject(goods1);
            oos.writeBoolean(true);
            oos.writeInt(12);
            oos.writeChar('C');
            oos.writeLong(123405);
            oos.flush();

            try {
                Goods goods = (Goods) ois.readObject();
                boolean b = ois.readBoolean();
                int i = ois.readInt();
                char c = ois.readChar();
                long l = ois.readLong();
                System.out.println(goods);
                System.out.println(b);
                System.out.println(i);
                System.out.println(c);
                System.out.println(l);
                fos.close();
                fis.close();
                oos.close();
                ois.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
