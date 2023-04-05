import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class HW_06_Oop {
    
        public void filterNB(HashSet<> notes) {
            System.out.print("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            System.out.printf("Inputed value: %d", value);
            System.out.print("\n");
            int Summa = 0;
            int Factorial = 1;
            for (int i = 0; i <= value; i++) {
                Summa = Summa + i;
            }
            if (value > 1) {
                for (int i = 1; i <= value; i++) {
                    Factorial = Factorial * i;
                }
            }
            System.out.printf("Triangle value is: %d", Summa);
            System.out.print("\n");
            System.out.printf("Factorial of value is: %d", Factorial);
            scanner.close();
        }
    }
    






















    public static void main(String[] args) {
        HW_06_Notebook nb1 = new HW_06_Notebook(1, "DELL", "Intel", 128, 480, 'W', "gray");
        HW_06_Notebook nb2 = new HW_06_Notebook();
        nb1.id = 2;
        nb1.brand = "HP";
        nb1.CPU = "AMD";
        nb1.RAM = 128;
        nb1.HDD = 1024;
        nb1.OS = 'W';
        nb1.color = "black";
        HW_06_Notebook nb3 = new HW_06_Notebook(3, "DELL", "Intel", 128, 480, 'W', "gray");
        HW_06_Notebook nb4 = new HW_06_Notebook(4, "HP", "Intel", 128, 1024, 'L', "black");
        HW_06_Notebook nb5 = new HW_06_Notebook(5, "DELL", "AMD", 128, 1024, 'L', "gray");
        HW_06_Notebook nb6 = new HW_06_Notebook(6, "HP", "Intel", 256, 480, 'N', "black");
        HW_06_Notebook nb7 = new HW_06_Notebook(7, "DELL", "Intel", 256, 720, 'W', "black");
        HW_06_Notebook nb8 = new HW_06_Notebook(8, "Huawei", "AMD", 256, 720, 'W', "white");
        Set<HW_06_Notebook> notes = new HashSet<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8));
        System.out.println(notes);



    }
}
