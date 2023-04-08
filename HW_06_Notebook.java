// + Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы.
// + Реализовать в Java.
// + Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
// и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев
//  — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// import java.util.Objects;

public class HW_06_Notebook {
    int id;
    String brand;
    String CPU;
    int RAM;
    int HDD;
    char OS;
    String color;

    public HW_06_Notebook() {
        id = 0;
        brand = "Unknown";
        CPU = "Unknown";
        RAM = 0;
        HDD = 0;
        OS = 'N';
        color = "Unknown";
    }

    public HW_06_Notebook(int id, String brand, String CPU, int RAM, int HDD, char OS,
            String color) {
        this.id = id;
        this.brand = brand;
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %d %c %s", id, brand, CPU, RAM, HDD, OS, color);
    }

    public int getRAM() {
        return RAM;
    }

    public int getCPU() {
        switch (CPU) {
            case "Intel": return 1;
            case "AMD": return 2;
            default: return 0;
            }
    }

    public int getOS() {
        switch (OS) {
            case 'W': return 1;
            case 'L': return 2;
            case 'N': return 3;
            default: return 0;
        }
    }
}
