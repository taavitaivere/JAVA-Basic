package Week10;

public class OOP {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic",  3.56);
        Hamburger.addHamburgerAddition1("Tomato", 0.27);
        Hamburger.addHamburgerAddition2("Lettuce", 0.75);
        Hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + Hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxBurger db = new DeluxBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
