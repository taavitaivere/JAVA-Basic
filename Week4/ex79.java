package Week4;

public class ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        stats.addNumbers(3);
        stats.addNumbers(5);
        stats.addNumbers(1);
        stats.addNumbers(2);
        System.out.println("Amount: " + stats.getAmountOfNumbers());
    }
}
