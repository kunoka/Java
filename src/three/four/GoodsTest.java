package three.four;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        System.out.println("请输入三个商品信息: ");
        Map<String,Goods> goodsList = new HashMap<String,Goods>();
        Scanner console = new Scanner(System.in);
        int i=0;
        double goodsPrice =0;
        while(i<3){
            System.out.println("请输入第" +(i+1) +"条商品信息！");
            System.out.println("请输入商品编号： ");
            //判断商品id是否存在
            String goodsId = console.next();
            System.out.println(goodsList.keySet());
            if(goodsList.keySet().contains(goodsId)){
                System.out.println("商品ID已经存在，请重新输入！");
                continue;
            }
            System.out.println("请输入商品名称: ");
            String goodsName = console.next();
            System.out.println("请输入商品价格: ");
            try {
                 goodsPrice = console.nextDouble();
            }catch (java.util.InputMismatchException e){
                System.out.println("数据类型错误，请输入数值型数据！");
                console.next();
                continue;
            }
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            goodsList.put(goodsId, goods);
            i++;
        }
        //输出商品信息
        System.out.println("全部的商品信息是: ");
        Iterator itGoods = goodsList.values().iterator();
        while (itGoods.hasNext()){
            System.out.println(itGoods.next());
        }
    }
}
