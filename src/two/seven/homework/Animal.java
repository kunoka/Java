package two.seven.homework;

public abstract class Animal {
    private String name;
    private int age;

    public void Animal() {

    }

    abstract public void love();
    public Animal(String name, int age) {
        setName(name);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
