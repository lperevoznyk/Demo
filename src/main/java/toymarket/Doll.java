package toymarket;

public class Doll extends Toy{

    private String colorOfHair;

    public Doll(int price, String name, String colorOfHair) {
        super(price, name);
        this.colorOfHair = colorOfHair;
    }

}
