package three.four;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
//        Set hs = new HashSet();
        hs.add("blue");
        hs.add("black");
        hs.add("red");
        hs.add("yellow");
        hs.add("white");

        // 使用迭代器输出所有字符
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        // 增加元素
        hs.add("pink");
        // 使用迭代器输出所有字符
        System.out.println("");
        System.out.println("****************");
        it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
