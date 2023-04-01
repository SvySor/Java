import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW_05_02 {
    // Пусть дан список сотрудников:
    // Иван Иванов
    // Светлана Петрова
    // Кристина Белова
    // Анна Мусина
    // Анна Крутова
    // Иван Юрин
    // Петр Лыков
    // Павел Чернов
    // Петр Чернышов
    // Мария Федорова
    // Марина Светлова
    // Мария Савина
    // Мария Рыкова
    // Марина Лугова
    // Анна Владимирова
    // Иван Мечников
    // Петр Петин
    // Иван Ежов
    // Написать программу, которая найдёт и выведет повторяющиеся имена с
    // количеством повторений. Отсортировать по убыванию популярности.

    public static void main(String[] args) {
        String[] employees = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин",
                "Иван Ежов" };
        List<String> FirstNames = new ArrayList<String>();
        for (String Name : employees) {
            String[] words = Name.split(" ");
            FirstNames.add(words[0]);
        }
        Map<String, Integer> mp = new HashMap<String, Integer>();
        for (String FirstName : FirstNames) {
            if (mp.keySet().contains(FirstName)) {
                mp.put(FirstName, mp.get(FirstName) + 1);
            } else {
                mp.put(FirstName, 1);
            }
        }
        System.out.println(mp);
    }
}