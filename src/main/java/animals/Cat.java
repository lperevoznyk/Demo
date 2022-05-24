package animals;

import main.Main;

public class Cat extends Animal implements Comparable<Cat>, Eatable {

    public Cat(String name, int age) {
        super(name, age);
        Main.dbConnection.getData();
    }

    public static void say() {
        new Cat("name", 12).sayName();
        System.out.println("Cat says");
    }

    @Override
    public void sayName() {
        System.out.println("Cat: My name is " + name);
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public void eat() {
        System.out.println("Я покушал");
    }
}