public class HW_03_01 {

    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int[] arrayLeft = new int[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);
        int[] arrayRight = new int[array.length - arrayLeft.length];
        System.arraycopy(array, arrayLeft.length, arrayRight, 0, array.length - arrayLeft.length);
        sortArray(arrayLeft);
        sortArray(arrayRight);
        mergeArray(array, arrayLeft, arrayRight);
        return array;
    }

    private static void mergeArray(int[] array, int[] arrayLeft, int[] arrayRight) {
        int positionLeft = 0;
        int positionRight = 0;
        for (int i = 0; i < array.length; i++) {
            if (positionLeft == arrayLeft.length) {
                array[i] = arrayRight[positionRight];
                positionRight++;
            } else if (positionRight == arrayRight.length) {
                array[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else if (arrayLeft[positionLeft] < arrayRight[positionRight]) {
                array[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else {
                array[i] = arrayRight[positionRight];
                positionRight++;
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 132, 1, 35, 45, 678, 32, 44, 57, 98, 44, 789, 21, 12, 79, 8765, 2, 88, 77, 191, 91,
                67, 37 };
        printArray(array);
        array = sortArray(array);
        printArray(array);
    }
}
