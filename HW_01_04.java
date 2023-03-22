

public class HW_04 {
    private static boolean Solver(char number1, char number2, char result1, int movement) {
    boolean Check = true;
    int my_case = 0;
    if ((number1 == '?') & (number2 == '?')) my_case = 0;
    if ((number1 == '?') & (number2 != '?')) my_case = 1;
    if ((number1 != '?') & (number2 == '?')) my_case = 2;
    if ((number1 != '?') & (number2 != '?')) my_case = 3;
    switch (my_case) {
        case 0:

            break;
        case 1:
            int number2_dig = number2;
            for (int i = 0; i < 10; i++){
                int count = i + number2_dig + movement;
                if (count == result1) {
                    int number02_dig = i;
                }
                else {
            }
            }
            break;
        case 2:
            break;
        case 3:
            break;
        default:
            System.out.printf("Error! Enter correct operator");
            break;
    }
    
    
    
    if (number1 == '?') {
        int i = 0;
        while ((i < 10) or ) {
            if (number2 == '?') {
                int j = 0;
                while 
        }
        System.out.print(number1);
    }
    else {
        System.out.print("цифра");
    }
    //         for (int i = 2; i < number; i++) {
    //             if (number % i == 0) {
    //                 Check = false;
    //             }
    //         }
    //     }
    return Check;
    }

    public static void main(String[] args) {
        String q_String = "2?";
        String w_String = "?5";
        String e_String = "69";
        char[] q_massive = q_String.toCharArray();
        char[] w_massive = w_String.toCharArray();
        char[] e_massive = e_String.toCharArray();
        int max_Length = q_massive.length;
        if (w_massive.length > max_Length) max_Length = w_massive.length;
        if (e_massive.length > max_Length) max_Length = e_massive.length;
        // int solved_1 = 0;
        // int solved_2 = 0;
        // int result = 0;
        int move = 0;
        boolean result = Solver(q_massive[q_massive.length-1], w_massive[w_massive.length-1], e_massive[e_massive.length-1], move);
        System.out.print(result);
    }
}
