import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class HW_04_02 {

    public static LinkedList<Integer> FillLinkedList(int[] array) {
        LinkedList<Integer> List = new LinkedList<Integer>();
        int i;
        for (i = 0; i < array.length; i++)
            List.add(array[i]);
        return List;
    }

    public static LinkedList<Integer> enquenell(LinkedList<Integer> List, Integer element) {
        List.add(element);
        return List;
    }

    public static LinkedList<Integer> dequenell(LinkedList<Integer> List) {
        List.pollFirst();
        return List;
    }

    public static Integer firstll(LinkedList<Integer> List) {
        Integer First = List.peekFirst();
        return First;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedli = new LinkedList<Integer>();
        int[] arrayInitial = new int[] { 841, 260, 373, 76, 157, 947, 958, 521, 609, 417, 379, 485, 73, 907, 890, 878,
                695, 531, 630, 887, 490, 323, 691, 607, 994, 507, 167, 74, 972, 466 };
        linkedli = FillLinkedList(arrayInitial);
        System.out.print("Начальная последовательность: " + linkedli);
        int enqueneElement = 204;
        linkedli = enquenell(linkedli, enqueneElement);
        System.out.print("\nДобавлен элемент в конец очереди: " + linkedli);
        linkedli = dequenell(linkedli);
        System.out.print("\nУдалён первый элемент: " + linkedli);
        Integer frst = firstll(linkedli);
        System.out.print("\nПервый элемент: " + frst);
    }
}
