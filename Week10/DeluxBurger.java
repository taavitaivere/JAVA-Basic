package Week10;

public class DeluxBurger extends Hamburger implements Itemize {
    public DeluxBurger() {
        super("Deluxe", 14.54 );
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + " ,price is " + price);
    }

    public void addHamburgerAddition1(String name, Double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition2(String name, Double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition3(String name, Double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition4(String name, Double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        double Chips = 2.75;
        double Drink = 1.81;
        double total = Chips + Drink + price;
        return total;
    }

}
