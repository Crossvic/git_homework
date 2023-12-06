import java.util.*;
import java.util.stream.Collectors;


public class SortCollection {
    public static void main (String[] args) {
        List<String> list = Arrays.asList ("f10", "f15", "f2", "f4", "f4");
        List<String> sortedList = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
