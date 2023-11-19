public class Main {

    public static void main(String[] args) {
        //1
        Employee employee = new Employee("Бортник Андрей Олегович", "Охранник", "be@gmail.com", 7123456, 50000, 40);
        employee.println();
        //2
        Employee[] persArr = new Employee[5];
        persArr[0] = new Employee("Mirnyi Oleg", "Engineer", "mo@mail.ru", 7172593, 80000, 37);
        persArr[1] = new Employee("Kozak Alex", "Driver", "koz@yandex.ru", 6824617, 55000, 41);
        persArr[2] = new Employee("Antonov Denis", "Assisnant manager", "ad@gmail.com", 63257814, 900000, 43);
        persArr[3] = new Employee("Ivanov Vadim", "Household manager", "ivvad@mail.ru", 72358941, 65000, 45);
        persArr[4] = new Employee("Dyk Evgenii", "Head of department", "hd@gmail.com", 7111333, 100000, 39);

        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].getAge() > 40) {
                persArr[i].println();
            }
        }
        //3
        Park park = new Park();
        park.addAttraction("Attraction 1", "10:00 AM - 8:00 PM", 15.99);
        park.addAttraction("Attraction 2", "10:00 AM - 8:00 PM", 15.99);

        park.displayAttractions();
    }
}