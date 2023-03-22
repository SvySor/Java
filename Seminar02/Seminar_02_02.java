package Seminar02;

import java.util.Scanner;

public class Seminar_02_02 {
    public static StringBuilder GetCrypt(String inputText) {
        StringBuilder editTxt = new StringBuilder();
        int count = 1;
        for (int i = 1; i < inputText.length(); i++) {
            if (inputText.charAt(i) == inputText.charAt(i-1)) {
                count += 1;
            }
        else {
            editTxt.append(inputText.charAt(i-1));
            if (count != 1){
                editTxt.append(count);
            }
            count = 1;    
            }
        }
        editTxt.append(inputText.charAt(inputText.length()-1));
        editTxt.append(count);
        return(editTxt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputText = scanner.nextLine();
        StringBuilder editText = GetCrypt(inputText);
        System.out.printf("Compressed string %s", editText);

        scanner.close();
    }
}
