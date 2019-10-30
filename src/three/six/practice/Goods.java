package three.six.practice;

import java.io.Serializable;

public class Goods implements Serializable {
    String id;
    String name;
    int price;

    public Goods(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "商品编号:" + id + "商品名称:" + name + "商品价格:" + price;
    }
}
