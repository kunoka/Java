package two.seven.homework;

/**
 * 表演者
 * 年龄
 * 品种
 * 技能
 * 爱好
 */
public class Parrot extends Animal implements IACT {
    private String species;

    public Parrot(String name, int age, String species){
        super(name, age);
        setSpecies(species);
    }

    @Override
    public void skill() {
        System.out.println("技能: 擅长模仿");
    }

    @Override
    public void love() {
        System.out.println("爱好: 喜欢吃坚果和松子");
    }

    @Override
    public void act() {
        System.out.println("表演者: " + getName());
        System.out.println("年龄: " + getAge() + "岁");
        System.out.println("品种: " + getSpecies());
        skill();
        love();
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
