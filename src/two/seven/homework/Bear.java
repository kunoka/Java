package two.seven.homework;

public class Bear extends Animal implements IACT {

    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void love() {
        System.out.println("爱好: 喜欢卖萌");
    }
    public void skill(){
        System.out.println("技能: 挽着花篮，打着雨伞，自立走秀");
    }
    public void act() {
        System.out.println("表演者: " + getName());
        System.out.println("年龄: " + getAge() + "岁");
        skill();
        love();
    }
}
