package Week6;

public class ex99 {
    public static void printArrayAsStars(int[] array) {
        for (int number : array) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }
}
