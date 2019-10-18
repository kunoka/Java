package two.seven.homework;

public class Lion extends Animal implements IACT {
    private boolean sex;
    private String coatColor;

    public Lion(String name, int age, boolean sex, String coatColor) {
        super(name, age);
        setSex(sex);
        setCoatColor(coatColor);
    }

    @Override
    public void love() {
        System.out.println("爱好: 喜欢吃各种肉类");
    }

    public void skill() {
        System.out.println("技能: 擅长钻火圈");
    }

    @Override
    public void act() {
        System.out.println("表演者: " + getName());
        System.out.println("年龄: " + getAge() + "岁");
        System.out.println("性别: " + getSexName(getSex()));
        System.out.println("毛色: " + getCoatColor());
        skill();
        love();
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }


    public boolean getSex() {
        return sex;
    }

    public String getCoatColor() {
        return coatColor;
    }

    private String getSexName(boolean sex) {
        if (sex) {
            return "公狮";
        } else {
            return "母狮";
        }
    }
}
