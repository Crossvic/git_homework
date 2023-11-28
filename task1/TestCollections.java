package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "авто", "капот", "дверь", "крыша", "дверь", "руль",
                "колесо", "сиденье", "селектор", "зеркало", "колесо", "селектор")
        );
        HashSet<String> uniqWords = new HashSet<>(words);
        System.out.println(uniqWords);

        for(String val : uniqWords) {
            System.out.printf("%s: %d\n", val, words.stream().filter(s -> s.equals(val)).count());
        }
    }
}
