import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class HW_06_Oop {
    
        public static void filterNB(Set<HW_06_Notebook> notes) {
            Scanner scanner = new Scanner(System.in);
            Map<String, Integer> criterias = new HashMap<>();
            System.out.print("Введите производителя процессора (1 - Intel/ 2 - AMD): ");
            criterias.put("processor", scanner.nextInt());
            System.out.print("Введите минимальный объём RAM (ГБ): ");
            criterias.put("ram_gb", scanner.nextInt());
            System.out.print("Введите минимальный объём HDD (ГБ): ");
            criterias.put("hdd_gb", scanner.nextInt());
            System.out.print("Введите предустановленную ОС HDD (1 - Windows, 2 - Linux, 3 - no OS): ");
            criterias.put("os", scanner.nextInt());
            System.out.print(criterias);
            for (HW_06_Notebook note : notes) {
                if (note.getCPU() == criterias.get("processor") && note.getRAM() > criterias.get("ram_gb")) {
                    System.out.println(note);
                }
            }
            scanner.close();
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
        filterNB(notes);
    }
}
