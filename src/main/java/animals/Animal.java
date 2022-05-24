package animals;

public class Animal {

    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void say() {
        System.out.println("Animal says");
    }

}
