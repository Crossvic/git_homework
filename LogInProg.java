import java.util.stream.*;
import java.util.*;

public class LogInProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> people = new ArrayList<>();
        System.out.println("Введите имя: ");
        while (true) {
            System.out.print("имя = ");
            s = scanner.nextLine();
            if (s.equals(""))
                break;
            people.add(s);
        }
        System.out.println();

        List<String> f = people.stream().filter(str -> str.startsWith("f")).collect(Collectors.toList());
        System.out.println(f);
    }
}


