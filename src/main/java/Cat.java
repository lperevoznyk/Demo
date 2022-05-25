import java.util.Objects;

public class Cat extends Animal {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        if(age < 0) {
            throw new MyCustomException("Age is lower then 0");
        }
        else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
