package toymarket;

public class ToyMarket {

    private Toy[] toys;

    public ToyMarket(Toy[] toys) {
        this.toys = toys;
    }


    private Toy getToyByName(String name) {
        for (Toy toy : toys) {
            if (toy.getName().equals(name)) {
                return toy;
            }
        }
        throw new RuntimeException("Can not find a toy with name " + name);
    }

    public void buyToy(Buyer buyer, String nameOfToy) {
        Toy chosenToy = getToyByName(nameOfToy);
        if (buyer.getMoney() > chosenToy.getPrice()) {
            buyer.setToy(chosenToy);
            System.out.println("Successfully buy a toy " + nameOfToy);
        } else {
            System.out.println("Sorry but you do not have enough money");
        }
    }
}
