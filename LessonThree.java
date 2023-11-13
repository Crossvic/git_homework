public class LessonThree {

    public static void main(String[] args) {
        sumCalc(3, 5); 
        display("Viktar", 3);
        numCheck(-8);
        logCalc(9);
        leapYear(2023); 
        numChange();
        myArray();
        numIncrease();
        fillDiagonal();
        lastTask(4, 5);
    }

    private static void sumCalc(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void display(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    private static void numCheck(int x) {
        if (x >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    private static void logCalc(int a) {
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    private static void leapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void numChange() {
        int[] numArr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 1) {
                numArr[i] = 0;
            } else if (numArr[i] == 0) {
                numArr[i] = 1;
            }
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }

    private static void myArray() {
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
    }

    private static void numIncrease() {
        int[] numIncr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numIncr.length; i++) {
            if (numIncr[i] < 6) {
                numIncr[i] = numIncr[i] * 2;
            }
            System.out.print(numIncr[i] + " ");
        }
        System.out.println();
    }

    private static void fillDiagonal() {
        int[][] arrDiag = new int[4][4];
        for (int i = 0; i < arrDiag.length; i++) {
            arrDiag[i][i] = 1;
            arrDiag[i][arrDiag.length - i - 1] = 1;
        }
        for (int i = 0; i < arrDiag.length; i++) {
            for (int j = 0; j < arrDiag.length; j++) {
                System.out.print(arrDiag[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void lastTask(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]: " + arr[i]);
        }
    }
}
