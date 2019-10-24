package three.four;

public class Goods {
    String id;
    String name;
    double price;

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "商品编号: " + id +"  商品名称: " + name + " 商品价格: " + price;
    }
}
