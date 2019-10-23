package three.four;

public class Cat {
    String name;
    int age;
    String species;

    public Cat(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "姓名: " + name + "  年龄: " + age + "  品种: " + species;
    }

    //重写hasCode 和 equals 方法后，就不能插入相同对象
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((species == null) ? 0 : species.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() == Cat.class) {
            Cat cat = (Cat) obj;
            return cat.getName().equals(name) && cat.getSpecies().equals(species) && (cat.getAge() == age);
        }
        return false;
    }
}
