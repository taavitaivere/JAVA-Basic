package Week6;

public class ex97 {
    public static void printElegantly(int[] array) {
        for (int number : array) {
            System.out.print(number + ", ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }
}
