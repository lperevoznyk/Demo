package animals;

import main.Main;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
        Main.dbConnection.getData();
    }

    public static void say() {
        System.out.println("Dog says");
    }

    @Override
    public void sayName() {
        System.out.println("Dog: My name is " + name);
    }

    public void bark() {
        System.out.println("Gav gav");
    }

}
