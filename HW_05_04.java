public class HW_05_04 {

    // Задача расстановки 8 ферзей на шахматной доске.

    // Имеем одномерный массив состоящий из 8 элементов. Индексные значения — это
    // строки, а значения в архиве по соответствующим индексам — это столбец
    // шахматной доски соответственно.
    static int[] chessboard = { 0, 0, 0, 0, 0, 0, 0, 0 };
    static int index = 0;
    static int version = 0;

    public static void main(String[] args) {

        do {
            if (checking()) {
                if (index == 7) {
                    System.out.println(version++ + " [0]=" + chessboard[0] + " [1]=" + chessboard[1] + " [2]="
                            + chessboard[2] + " [3]=" + chessboard[3] + " [4]=" + chessboard[4] + " [5]="
                            + chessboard[5] + " [6]=" + chessboard[6] + " [7]=" + chessboard[7]);
                    chessboard[index]++;
                } else {
                    index++;
                }
            } else {
                chessboard[index]++;
            }
        } while (chessboard[0] < 8);
    }

    // Для того, чтобы мы оставили Ферзя в покое и начали перемещать следующего,
    // должны отсутствовать
    // иные Ферзи:
    // 1. по вертикали
    // 2. по диагоналям
    // 3. по горизонтали

    // Третий пункт в данном методе решения этой задачи можно исключить сразу,
    // так как два Ферзя в одной строке мы изначально не рассматриваем.

    static boolean checking() {
        int i;
        if (index == 0) {
            return true;
        }
        if (chessboard[index] > 7) {
            chessboard[index] = 0;
            index--;
            return false;
        }

        for (i = 0; i < index; i++) {

            // Из чего получаем, что нам необходимо для исключения вертикали сравнить
            // равенство номер столбцов, а для исключения диагоналей сравнить модуль
            // разницы столбцов с разницей строк у устанавливаемого и проверяемого Ферзей.

            if ((chessboard[index] == chessboard[i]) | ((Math.abs(chessboard[index] - chessboard[i])) == (index - i))) {
                return false;
            }
        }
        return true;
    }
}
