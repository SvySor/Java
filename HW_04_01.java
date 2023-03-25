// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.LinkedList;

public class HW_04_01 {

    public static LinkedList<Integer> FillLinkedList(int[] array) {
        LinkedList<Integer> List = new LinkedList<Integer>();
        int i;
        for (i = 0; i < array.length; i++)
            List.add(array[i]);
        return List;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist) {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);
        }
        return llist;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedli = new LinkedList<Integer>();
        int[] arrayInitial = new int[] { 841, 260, 373, 76, 157, 947, 958, 521, 609, 417, 379, 485, 73, 907, 890, 878,
                695, 531, 630, 887, 490, 323, 691, 607, 994, 507, 167, 74, 972, 466 };
        linkedli = FillLinkedList(arrayInitial);
        System.out.print("Начальная последовательность: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nРеверсивная последовательность: " + linkedli);
    }
}
