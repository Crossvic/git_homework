package task2;

public class Main {

    public static void main (String[] args) {

        PhoneBook.addContact("Иванов" ,"+375 29 6332581");
        PhoneBook.addContact("Петров" ,"+375 44 7442288");
        PhoneBook.addContact("Иванов" ,"+375 33 5882112");
        PhoneBook.addContact("Сидоров" ,"+375 44 7501015");

        PhoneBook.findPerson("Иванов");

    }

    }

