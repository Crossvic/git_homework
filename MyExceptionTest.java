public class MyExceptionTest {
    public static void main(String[] args) {

        String[][] stringArray0 =  {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "G", "4"},
                {"1", "3", "6", "9"}
        };
        String[][] stringArray1 =  {
                {"1", "2", "3", "4"},
                {"6", "2", "3", "4"},
                {"1", "2", "4", "6"},
                {"3", "2", "4", "8"}
        };
        String[][] stringArray2 =  {
                {"5", "G", "3"},
                {"2", "2", "3", "4"},
                {"1", "2", "5", "6"},
                {"2", "2", "4", "6"}
        };
        String[][] stringArray3 =  {
                {"5", "2", "3", "4"},
                {"4", "2", "5", "6"},
                {"6", "2", "4", "8"}
        };

        try {
            System.out.println("Сумма элементов массива составляет: " + checkArr(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива составляет: " + checkArr(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива составляет: " + checkArr(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива составляет: " + checkArr(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int checkArr (String[][] ent) throws MyArraySizeException, MyArrayDataException {
        int arr = 4;
        int sum = 0;

        if (ent.length != 4) {
            throw new MyArraySizeException(String.format("Размер массива должен быть %dx%d.", arr, arr));
        }

        for (String[] strings : ent) {
            if (strings.length != 4) {
                throw new MyArraySizeException(String.format("Размер массива должен быть %dx%d.", arr, arr));
            }
        }

        for (int i = 0; i < ent.length; i++) {
            for (int j = 0; j < ent[i].length; j++) {
                try {
                    sum += Integer.parseInt(ent[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива отсутствует целое число: %s.", i, j, ent[i][j]));
                }
            }
        }

        return sum;
    }
}