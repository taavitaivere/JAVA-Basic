package Week10;

import java.util.ArrayList;

public class HealthyBurger implements Itemize {
    ArrayList<String> arrayList;
    ArrayList<Double> arrayList2;
    String name;
    String meat;
    Double price;
    String breadRollType;
    String healthyExtra1Name;
    Double healthyExtra1Price;
    String healthyExtra2Name;
    Double healthyExtra2Price;

    public HealthyBurger(String meat, Double price) {
        this.arrayList = new ArrayList<String>();
        this.arrayList2 = new ArrayList<Double>();
        this.name = "Healthy Burger";
        this.meat = meat;
        this.price = price;
        this.breadRollType = "Brown Rye";
        System.out.println("You have ordered a " + this.name + " with " + this.meat + " meat, " + this.breadRollType + " bread roll, and " + this.price + " price.");
    }

    public void addHealthyAddition1(String name, Double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        this.arrayList.add(this.healthyExtra1Name);
        this.arrayList2.add(this.healthyExtra1Price);
        System.out.println("You have added " + this.healthyExtra1Name + " with " + this.healthyExtra1Price + " price.");
    }

    public void addHealthyAddition2(String name, Double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        this.arrayList.add(this.healthyExtra2Name);
        this.arrayList2.add(this.healthyExtra2Price);
        System.out.println("You have added " + this.healthyExtra2Name + " with " + this.healthyExtra2Price + " price.");
    }

    @Override
    public double itemizeHamburger() {
        Double hamburgerPrice = this.price;
        System.out.println(this.name + " price is " + this.price + ".");
        for (int i = 0; i < this.arrayList.size(); i++) {
            hamburgerPrice += this.arrayList2.get(i);
            System.out.println("Added " + this.arrayList.get(i) + " for an extra " + this.arrayList2.get(i) + ".");
        }
        return hamburgerPrice;
    }
}
