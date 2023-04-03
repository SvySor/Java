// Реализовать класс и вывести его в консоль.

package Seminar06;

public class Seminar06_04_Cat {
    int id;
    String name;
    int birthYear;
    String breed;
    char sex;

    public Seminar06_04_Cat() {
        id = 0;
        name = null;
        birthYear = 1900;
        breed = null;
        sex = 0;
    }

    public Seminar06_04_Cat(int id, String name, int birthYear, String breed, char sex) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.breed = breed;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d %s %c", id, name, birthYear, breed, sex);
    }

}