package toymarket;

public abstract class Toy {

    private int price;
    private String name;

    Toy(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
