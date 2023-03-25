import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class create_Random_Array {

    public static int[] createRandomArray(int length, int min, int max) {
        int[] result = length > 0 ? new int[length] : new int[0];
        if (length > 0) {
            Random rand = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите длинну массива (n >= 2): ");
            n = sc.nextInt();
        } while (n < 2);
        System.out.print("Введите минимальное значение массива: ");
        int arrayMin = sc.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int arrayMax = sc.nextInt();
        int[] array = createRandomArray(n, arrayMin, arrayMax);
        System.out.println("Дан массив: " + Arrays.toString(array));
    }

}
