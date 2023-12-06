package task4;

import task4.SortStudents;

public class Main {
    public static void main(String[] args) {
        SortStudents students = new SortStudents();

        double averageAgeOfMen = students.calculateAverageAgeOfManStudents();
        System.out.println("Средний возраст студентов мужского пола: " + averageAgeOfMen);

        System.out.println("Студенты призывного возраста: " + students.getStudentsOfMilitaryAge());
    }
}
