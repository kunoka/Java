package two.seven.homework;

/**
 * 表演者
 * 年龄
 * 品种
 * 技能
 * 爱好
 */
public class Monkey extends Animal implements IACT {
    String species;

    @Override
    public void act() {
        System.out.println("表演者: " + getName());
        System.out.println("年龄: " + getAge());
        System.out.println("品种：" + getSpecies());
        skill();
        love();
    }

    public Monkey(String name, int age, String species) {
        super(name, age);
        setSpecies(species);
    }

    @Override
    public void skill() {
        System.out.println("技能: 骑车过独木桥");
    }

    @Override
    public void love() {
        System.out.println("爱好: 喜欢模仿人的动作表情");
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
