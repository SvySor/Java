package Seminar01;

// Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1,1], вывести максимальное количество подряд идущих 1

public class Program_04 {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1,0,1,1,1,1,1};
        int counter = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                counter ++;
                if (counter > max) max = counter;
            }
            else {
                counter = 0;
            }
        }
        System.out.printf("Inputed value: %d", max);
    }
}
