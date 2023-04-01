package Seminar06;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Seminar06_02 {

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами
    // от 0 до 24.
    // Создайте метод, в который передайте заполненный выше массив и с помощью set
    // вычислите процент уникальных чисел.
    // Для вычисления процента используйте формулу: % уникальных чисел * 100 / общее
    // к-во чисел в массиве.

    public static void main(String[] args) {
        Integer[] array = RandomArray(1000, 0, 24);
        UnicNumbers(array);
    }

    public static void UnicNumbers(Integer[] arr) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (Integer number : arr) {
            if (mp.keySet().contains(number)) {
                mp.put(number, mp.get(number) + 1);
            } else {
                mp.put(number, 1);
            }
        }
        System.out.print(mp);
    }

    public static Integer[] RandomArray(int length, int min, int max) {
        Integer[] result = length > 0 ? new Integer[length] : new Integer[0];
        if (length > 0) {
            Random rand = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }

}
