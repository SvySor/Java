package Seminar01;
public class HW_02 {

    public static void main(String[] args) {
        int value = 1000;
        
        
        # Задайте натуральное число N. Напишите программу, которая составит список простых множителей числа N.


        def IsSimple(num):
            Check = True
            if num != 1:
                for i in range(2, num):
                    if num % i == 0:
                        Check = False
            return Check
        
        # number = int(input(f"Введите натуральное число N: "))
        number = 100000002
        DeviderList = []
        inDeviderList = False
        if number == 0:
            print("У числа 0 бесконечное количество делителей")
        else:
            for i in range(1, number + 1):
                inDeviderList = False
                # print("i ", i)
                for j in range(1, len(DeviderList)):
                    # print("j ", j)
                    if (i % DeviderList[j] == 0):
                        inDeviderList = True
                if inDeviderList == False:
                    if number % i == 0:
                        if IsSimple(i) == True:
                            DeviderList.append(i)
        print("Делители числа N :", DeviderList)



















        
        
        System.out.printf("Inputed value: %d", value);
        System.out.print("\n");
        int Summa = 0;
        int Factorial = 1;
        for (int i = 0; i <= value; i++) {
            Summa = Summa + i;
            }
        if (value > 1) {
            for (int i = 1; i <= value; i++) {
                Factorial = Factorial * i;
                }
            }
        System.out.printf("Triangle value is: %d", Summa);
        System.out.print("\n");
        System.out.printf("Factorial of value is: %d", Factorial);
        scanner.close();
    }
}