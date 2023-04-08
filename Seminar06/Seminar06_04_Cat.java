// Реализовать класс и вывести его в консоль.
// Второе задание 

package Seminar06;

import java.util.Objects;

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

    @Override
    public boolean equals(Object object){
        Seminar06_04_Cat obj = (Seminar06_04_Cat) object;
       return this.id == obj.id &&
            (this.name).equals(obj.name) &&
            this.birthYear == obj.birthYear &&
            (this.breed).equals(obj.breed) &&
            this.sex == obj.sex;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}