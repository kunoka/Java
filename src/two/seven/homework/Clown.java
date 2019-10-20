package two.seven.homework;

/**
 * 表演者
 * 艺龄
 * 着装
 * 技能
 */
public class Clown implements IACT {
    String name;
    int age;
    String cloth;

    public Clown(String name, int age) {
        setAge(age);
        setName(name);
    }

    @Override
    public void act() {
        System.out.println("姓名: " + getName());
        System.out.println("艺龄: " + getAge() + "岁");
        dress();
        skill();
    }

    public void dress() {
        System.out.println("着装: 身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
    }

    @Override
    public void skill() {
        System.out.println("技能: 脚踩高跷，进行杂技魔术表演");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
