package Week8;

public class ex10_2 {
    public static void main(String[] args) {
        MilitaryService day1 = new MilitaryService(362);

        day1.work();
        System.out.println("Days left to militaryService" + day1.getDaysLeft());
    }
}
