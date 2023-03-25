// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Arrays;

public class HW_03_02 {

    public static Integer[] deleteEvenElements(int[] array) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        int i;
        for (i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) List.add(array[i]);
        }
        return List.toArray(new Integer[List.size()]);
    }


    public static void main(String[] args) {
        int[] arrayInitial = new int[] {9, 44, 6, 88, 5, 69, 10, 56, 78, 34, 9, 5, 0, 63, 43, 47, 1, 52, 42, 19, 51, 39, 29, 40, 35, 25, 30, 9, 75, 35, 68, 45 };
        System.out.println("Ваш массив: " + Arrays.toString(arrayInitial));
        Integer[] arrayOdd = deleteEvenElements(Arrays.copyOf(arrayInitial, arrayInitial.length));
        System.out.println("Удаляем чётные элементы массива: " + Arrays.toString(arrayOdd));
    }
}
