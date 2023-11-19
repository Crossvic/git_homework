package Task_1;

public class Cat extends Animal {
    private static int countCats = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean satiety;

    public Cat() {
        super();
        countCats++;
        satiety = false;
    }

    static int getCountCats() {
        return countCats;
    }

    void eat(int foodAmount, Plate plate) {
        if (plate.decreaseFood(foodAmount)) {
            satiety = true;
            System.out.println("Кот наелся из тарелки. Теперь он сыт.");
        } else {
            System.out.println("Коту не хватило еды.");
        }
    }

    boolean isSatiety() {
        return satiety;
    }

    @Override
    void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот пробежал " + distance);
        } else {
            System.out.println("Кот не может пробежать такое расстояние.");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}
