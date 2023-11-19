package Task_1;

public class Dog extends Animal {
    private static int countDogs = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog() {
        super();
        countDogs++;
    }

    static int getCountDogs() {
        return countDogs;
    }

    @Override
    void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака пробежала " + distance);
        } else {
            System.out.println("Собака не может пробежать такое расстояние.");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака проплыла " + distance);
        } else {
            System.out.println("Собака не может проплыть такое расстояние.");
        }
    }
}
