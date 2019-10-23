package three.four;

import java.util.*;

public class DictionaryDemo {
    public static void main(String[] args) {
        //输入三组数据
        Map<String, String> animal = new HashMap<String, String>();
        int i =0;
        while (i < 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入key: ");
            String key = sc.next();
            System.out.println("请输入 value");
            String value = sc.next();
            animal.put(key, value);
            i++;
        }
        //打印输出value的值（直接使用迭代器）
        System.out.println("***********************");
        System.out.println("使用迭代器输出所有的value值");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        //打印输出key和value的值
        //通过entrySet方法
        System.out.println("通过entrySet方法得到key-value:");
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for(Map.Entry<String, String> entry:entrySet){
            System.out.print(entry.getKey() + '-');
            System.out.println(entry.getValue());
        }
    }
}
