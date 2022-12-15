package Week10;

import java.util.ArrayList;


public class Hamburger implements Itemize {
    ArrayList<String>arrList;
    ArrayList<Double>arrList2;
    String name;
    String meat;
    Double price;
    String breadRollType;
    String addition1Name;
    Double addition1Price;
    String addition2Name;
    Double addition2Price;
    String addition3Name;
    Double addition3Price;
    String addition4Name;
    Double addition4Price;

    public Hamburger(String meat, Double price) {
        this.arrList = new ArrayList<String>();
        this.arrList2 = new ArrayList<Double>();
        this.name = "Hamburger";
        this.meat = meat;
        this.price = price;
        this.breadRollType = "White";
        System.out.println("You have ordered a " + this.name + " with " + this.meat + " meat, " + this.breadRollType + " bread roll, and " + this.price + " price.");
    }
    public static void addHamburgerAddition1(String name, Double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        this.arrList.add(this.addition1Name);
        this.arrList2.add(this.addition1Price);
        System.out.println("You have added " + this.addition1Name + " with " + this.addition1Price + " price.");
    }

    public static void addHamburgerAddition2(String name, Double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        this.arrList.add(this.addition2Name);
        this.arrList2.add(this.addition2Price);
        System.out.println("You have added " + this.addition2Name + " with " + this.addition2Price + " price.");
    }

    public static void addHamburgerAddition3(String name, Double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        this.arrList.add(this.addition3Name);
        this.arrList2.add(this.addition3Price);
        System.out.println("You have added " + this.addition3Name + " with " + this.addition3Price + " price.");
    }

    public void addHamburgerAddition4(String name, Double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        this.arrList.add(this.addition4Name);
        this.arrList2.add(this.addition4Price);
        System.out.println("You have added " + this.addition4Name + " with " + this.addition4Price + " price.");
    }

    @Override
    public static double itemizeHamburger() {
        Double hamburgerPrice = this.price;
        System.out.println(this.name + " price is " + this.price + ".");
        for (int i = 0; i < this.arrList.size(); i++) {
            hamburgerPrice += this.arrList2.get(i);
            System.out.println("Added " + this.arrList.get(i) + " for an extra " + this.arrList2.get(i) + ".");
        }
        return hamburgerPrice;
    }
}
