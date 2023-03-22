import java.util.Scanner;

public class HW_02_01 {

    // Дана строка sql-запроса "select * from students where ". Сформируйте часть
    // WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
    // ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.

    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
    // "city":"Moscow", "age":"null"}

    public static StringBuilder addFilter(Scanner scanner, StringBuilder request) {
        System.out.print("Enter name of filter: ");
        String filterName = scanner.next();
        System.out.print("Enter data of filter: ");
        String filterData = scanner.next();
        StringBuilder builder = new StringBuilder();
        if (filterData != "null") {
            builder = builder.append(request + " " + filterName + " = " + "'" + filterData + "'");
        }
        System.out.printf("Your current request is: %s", builder);
        return builder;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue the request:");
        StringBuilder Request = new StringBuilder("select * from students where");
        System.out.println(Request);
        Request = addFilter(scanner, Request);
        char operation = 'Y';
        while (operation != 'N') {
            System.out.print("\nAdd more filter to request? (Y, N): ");
            operation = scanner.next().charAt(0);
            if (operation == 'Y') {
                Request = Request.append(" and");
                Request = addFilter(scanner, Request);
            }
        }
        System.out.printf("Your final request is: %s", Request);
        scanner.close();
    }
}
