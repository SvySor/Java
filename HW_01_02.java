

// Вывести все простые числа от 1 до 1000

public class HW_01_02 {
    private static boolean IsSimple(int number) {
        boolean Check = true;
        if (number != 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    Check = false;
                }
            }
        }
        return Check;
    }

    public static void main(String[] args) {
        int value = 1000;
        for (int i = 1; i <= value; i++) {
            if (IsSimple(i) == true) {
                System.out.printf(i + "\t");
            }
        }
    }
}