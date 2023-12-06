import java.util.stream.IntStream;

class PosNumbers {
    public static void main(String[] args) {
        long count = IntStream.of(1,5,4,3,9,8,7,6,2,4,1,10).filter(i-> i%2==0).count();
        System.out.println("Количество четных чисел: " + count);
    }
}
















