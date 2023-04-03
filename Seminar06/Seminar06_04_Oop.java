package Seminar06;

public class Seminar06_04_Oop {

    public static void main(String[] args) {
        Seminar06_04_Cat cat1 = new Seminar06_04_Cat(1, "Barsik", 2021, "Unknown", 'm');
        Seminar06_04_Cat cat2 = new Seminar06_04_Cat();
        cat2.id = 2;
        cat2.name = "Marusya";
        cat2.birthYear = 2020;
        cat2.breed = "Persyd";
        cat2.sex = 'f';
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
