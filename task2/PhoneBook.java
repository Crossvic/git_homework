package task2;

import java.util.*;

public class PhoneBook {
    private static final Map<String, List<String>> book = new LinkedHashMap<>();

    public static void addContact(String surname, String number) {
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
            }
        } else {
            book.put(surname, new ArrayList<>(Collections.singletonList(number)));
        }
        System.out.printf("Номер %s добавлен для контакта %s%n", number, surname);
    }

    public static void findPerson(String surname) {
        if(book.containsKey(surname)){
            System.out.printf("Номера для контакта %s \n%s%n", surname, book.get(surname));
        } else {
            System.out.printf("Нет записи для контакта %s%n", surname);
        }
    }
}
