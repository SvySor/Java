package Seminar06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Seminar06_04_Oop {

    public static void main(String[] args) {
        Seminar06_04_Cat cat1 = new Seminar06_04_Cat(1, "Barsik", 2021, "Unknown", 'm');
        Seminar06_04_Cat cat2 = new Seminar06_04_Cat();
        cat2.id = 2;
        cat2.name = "Marusya";
        cat2.birthYear = 2020;
        cat2.breed = "Persyd";
        cat2.sex = 'f';
        Seminar06_04_Cat cat3 = new Seminar06_04_Cat(1, "Barsik", 2021, "Unknown", 'm');
        Seminar06_04_Cat cat4 = new Seminar06_04_Cat(1, "Barsik", 2021, "Unknown", 'm');
        Seminar06_04_Cat cat5 = new Seminar06_04_Cat(1, "Barsik", 2021, "Unknown", 'm');
        Set<Seminar06_04_Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5));
        System.out.println(cats);
    }
}
