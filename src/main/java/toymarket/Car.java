package toymarket;

public class Car extends Toy{

    private boolean isElectric;

    public Car(int price, String name, boolean isElectric) {
        super(price, name);
        this.isElectric = isElectric;
    }
}
