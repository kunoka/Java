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

    public Clown(String name, int age, String cloth) {
        setAge(age);
        setCloth(cloth);
        setName(name);
    }

    @Override
    public void act() {
        System.out.println("姓名: " + getName());
        System.out.println("艺龄: " + getAge() + "岁");
        System.out.println("着装: " + getCloth());
        skill();
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


    public void setCloth(String cloth) {
        this.cloth = cloth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getCloth() {
        return cloth;
    }
}
