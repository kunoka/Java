package three.four;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("花花", 12,"英国短毛猫");
        Cat fanfan = new Cat("凡凡", 6,"中华田园猫");

        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);

        Iterator<Cat> it = set.iterator();
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
        Set<Cat> set1 = new HashSet<Cat>();
        // 删除花花二代的信息并重新输出
        for(Cat cat:set){
//            if("花花".equals(cat.getName())){
//                set.remove(cat);
//                break;
//            }
            System.out.println(cat.getAge());
            if(cat.getAge() > 6){
                set1.add(cat);
            }
        }
        for(Cat cat:set1){
            System.out.println(cat);
        }
        set.removeAll(set1);
        System.out.println("*********************");
        System.out.println("删除大于6岁后的列表为");
        for(Cat cat:set){
            System.out.print(cat);
            System.out.println();
        }
        //删除所有
        boolean flag1 = set.removeAll(set);
        if(flag1){
            System.out.println("删除成功");
        }else {
            System.out.println("没有删除成功");
        }
        if(set.isEmpty()){
            System.out.println("猫都不见了");
        }else{
            System.out.println("猫猫还在");
        }
        //删除所有年龄大于6个月的
    }

}
