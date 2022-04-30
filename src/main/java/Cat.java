public class Cat {

    int age;
    String name;

    static int count = 0;

    Cat() {
        System.out.println("Конструктор без параметров");
        count++;
    }

    Cat(String name) {
        System.out.println("Конструктор с параметрами");
        this.name = name;
        count++;
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void say(int value) {
        System.out.println("Cat " + name + " say 'Meov'");
    }

    void say(String value) {
        System.out.println("Cat " + name + " say " + value);
    }

}