import java.util.*;

public class MyCollection {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Highload", "High", "Load", "Highload");

        long count = list.stream().filter("High"::equals).count();
        System.out.println("Слово High встречается в коллекции: " + count + " раз");
        String first = list.stream().findFirst().orElse("0");
        System.out.println("Первый элемент коллекции: " + first);
        String last = list.stream().skip(list.size() - 1).findFirst().orElse("0");
        System.out.println("Последний элемент коллекции: " + last);

    }
}
