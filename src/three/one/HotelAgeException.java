package three.one;

public class HotelAgeException extends Exception {
    public HotelAgeException() {
        super("年龄小于18，大于80的需要亲属陪同才能入住");
    }
}
