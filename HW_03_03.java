
import java.util.ArrayList;

public class HW_03_03 {

    public static ArrayList<Integer> FillArrayList(int[] array) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        int i;
        for (i = 0; i < array.length; i++)
            List.add(array[i]);
        return List;
    }

    public static int MinArrayList(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int MaxArrayList(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer i : list) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int AverageArrayList(ArrayList<Integer> list) {
        int summ = 0;
        for (Integer i : list)
            summ = summ + i;
        return summ / list.size();
    }

    public static void main(String[] args) {
        int[] arrayInitial = new int[] { 125, 408, 89, 250, 21, 238, 98, 105, 149, 320, 492, 500, 346, 483, 158, 179,
                154, 400, 457, 230, 475, 97, 360, 346, 107, 300, 123, 284 };
        ArrayList<Integer> List = new ArrayList<Integer>();
        List = FillArrayList(arrayInitial);
        System.out.println("Ваш список: " + List);
        int min = MinArrayList(List);
        System.out.println("Минимальный элемент списка: " + min);
        int max = MaxArrayList(List);
        System.out.println("Максимальный элемент списка: " + max);
        int average = AverageArrayList(List);
        System.out.println("Средне арифметическое списка: " + average);
    }
}
