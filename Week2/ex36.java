package Week2;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        System.out.println("Type number: ");
        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            if (number % 2 == 0) {
                even++;
            } else { odd++;}
        }
        System.out.println("Thank you and see you!");
        System.out.println("The sum is " + sum);
        System.out.println("The count is " + count);
        System.out.println("How many numbers: " + count);
        double average = (double)sum / count;
        System.out.println("The average is " + average);
        System.out.println("The even numbers:" + even);
        System.out.println("The odd numbers:" + odd);
    }
}
