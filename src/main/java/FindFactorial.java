public class FindFactorial {
    public static int factorial(int n){

        if (n < 0) {
            throw new IllegalArgumentException("Вы ввели отрицательное число");
        }

        int result = 1;
        for (int i = 1; i <=n; i ++){
            result *= i;
        }
        return result;
    }
}
