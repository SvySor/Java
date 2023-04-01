package Seminar05;

import java.util.HashMap;
import java.util.Map.Entry;

public class Seminar_05_01 {

    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(123456, "Ivanov");
        employees.put(321456, "Vasilev");
        employees.put(234561, "Petrova");
        employees.put(234432, "Ivanov");
        employees.put(654321, "Petrova");
        employees.put(345678, "Ivanov");
        for (Entry<Integer, String> pair : employees.entrySet()) {
            if (pair.getValue().equals("Ivanov"))
                System.out.println(String.format("%d %s", pair.getKey(), pair.getValue()));
        }
    }
}
