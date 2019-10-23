package three.four;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("花花", 12,"英国短毛猫");
        Cat fanfan = new Cat("凡凡", 6,"中华田园猫");

        Set set = new HashSet();
        set.add(huahua);
        set.add(fanfan);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Cat huahua2 = new Cat("花花", 12,"英国短毛猫");
        set.add(huahua2);
        System.out.println("*********************");
        System.out.println("插入后的列表为");
        it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //重新插入一个新宠物猫
        Cat huahua02 = new Cat("花花二代", 8,"名品波斯猫");
        set.add(huahua02);
        System.out.println("插入后的列表为");
        it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //在集合中查的花花的信息并输出
        if(set.contains(huahua)){
            System.out.println("查找到的花花信息是: ");
            System.out.println(huahua);
        }else{
            System.out.println("没有找到");
        }
        //另外一种方式 根据名字查找
        System.out.println("另一种根据名字查找");
        it = set.iterator();
        boolean flag = false;
        Cat c = null;
        while(it.hasNext()){
            c = (Cat)(it.next());
            if(c.getName() == "花花"){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("找到了，花花的信息是: ");
            System.out.println(c);
        }else{
            System.out.println("没有找到");
        }
    }
}
