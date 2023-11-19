package Task_1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Всего животных: " + Animal.getCountAnimals());
        System.out.println("Всего собак: " + Dog.getCountDogs());
        System.out.println("Всего котов: " + Cat.getCountCats());

        dog1.run(400);
        dog2.swim(5);

        cat1.run(150);
        cat2.swim(2);





        Cat[] cats = {
                new Cat(),
                new Cat(),
                new Cat(),
        };
        Plate plate = new Plate(14);
        for (Cat cat : cats) {
            cat.eat(5, plate);
        }
        plate.amountOfFood();
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.isSatiety() + " сыт.");
        }
        plate.addFood(10);
        plate.amountOfFood();
    }
}