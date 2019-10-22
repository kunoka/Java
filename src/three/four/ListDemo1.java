package three.four;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("JAVA");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("Swift");

        System.out.println("列表的长度为: " + list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + ",");
        }
        System.out.println();
        System.out.println("************************");
//        list.remove(2);*/
        list.remove("C++");
        System.out.println("移除c++后的列表为: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + ",");
        }
        System.out.println(list.contains("JAVA"));
    }
}
