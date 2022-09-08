package Week2;

public class ex39 {
    private static void printStars(int amount) {
        int times = 1;
        while (times <= amount) {
            System.out.println("* ");
            times++;
        }
        System.out.println();
    }

    private static void printSquare(int sideSize) {
        int row = 1;
        while (row <= sideSize) {
            int field = 1;
            while (field <= sideSize) {
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    private static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            int field = 1;
            while (field <= size) {
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    private static void printRectangle(int width, int height) {
        int row = 1;
        while (row <= height) {
            int field = 1;
            while (field <= height) {
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args){
        printStars(4);
        printSquare(4);
        printTriangle(4);
        printRectangle(4,4);
    }
}
