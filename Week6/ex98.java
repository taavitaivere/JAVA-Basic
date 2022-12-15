package Week6;

import java.util.Arrays;

public class ex98 {
    public static void main(String[] args) {
        int [] original = {1, 2, 3, 4};
        int [] copied = copy(original);

        copied[0] = 99;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }
}
