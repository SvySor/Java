import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class HW_02_02 {

    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
    // каждой итерации запишите в лог-файл.

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(HW_02_02.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        // logger.addHandler(ch);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] mas = {38, 1, 14, 37, 114, 12, 73};
        System.out.println(Arrays.toString(mas));
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    logger.log(Level.INFO,"Current array: " + Arrays.toString(mas));
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
