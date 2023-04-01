import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class HW_05_01 {

    public static void PrintFullBook(HashMap<String, String> phoneBook) {
        for (Entry<String, String> pair : phoneBook.entrySet()) {
            System.out.println(String.format("%s %s", pair.getValue(), pair.getKey()));
        }
    }

    public static void ShowPhones(Scanner sc, HashMap<String, String> phoneBook) {
        System.out.print("Enter name: ");
        String filterName = sc.nextLine();
        for (Entry<String, String> pair : phoneBook.entrySet()) {
            if (pair.getValue().equals(filterName))
                System.out.println(String.format("%s %s", pair.getValue(), pair.getKey()));
        }

    }

    public static HashMap<String, String> AddNewContact(Scanner sc, HashMap<String, String> phoneBook) {
        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new phone: ");
        String newPhone = sc.nextLine();
        System.out.println(String.format("You enter: %s %s", newName, newPhone));
        phoneBook.put(newPhone, newName);
        return phoneBook;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("89851234569", "Ivanov Oleg");
        phoneBook.put("89163214561", "Vasilev Dmitry");
        phoneBook.put("83352345613", "Petrova Irina");
        phoneBook.put("37852344321", "Ivanov Oleg");
        phoneBook.put("89166543214", "Petrova Olga");
        phoneBook.put("73313456784", "Ivanov Oleg");
        PrintFullBook(phoneBook);
        phoneBook = AddNewContact(scanner, phoneBook);
        PrintFullBook(phoneBook);
        ShowPhones(scanner, phoneBook);
        scanner.close();
    }
}
