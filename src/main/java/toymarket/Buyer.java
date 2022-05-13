package toymarket;

public class Buyer {

    private int money;
    private Toy toy;

    public Buyer(int money) {
        this.money = money;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public Toy getToys() {
        return toy;
    }

    public int getMoney() {
        return money;
    }
}