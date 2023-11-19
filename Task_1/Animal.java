package Task_1;

public abstract class Animal {
    private static int countAnimals = 0;

    public Animal() {
        countAnimals++;
    }

    static int getCountAnimals() {
        return countAnimals;
    }

    abstract void run(int distance);

    abstract void swim(int distance);
}
