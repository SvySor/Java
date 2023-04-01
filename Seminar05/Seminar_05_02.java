package Seminar05;

import java.util.HashMap;

public class Seminar_05_02 {

    public static void main(String[] args){
        HashMap<Integer, String> word1 = new HashMap<>();
        System.out.println(word1.hashCode());
        word1.put(1, "too");
        HashMap<Integer, String> word2 = new HashMap<>();
        System.out.println(word2.hashCode());
        word2.put(1, "boo");
        if (word1 != word2)
            ;
        else {
        }
    }
}
