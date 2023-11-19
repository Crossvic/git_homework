package Task_1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = Math.max(0, food);
    }

    boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    void addFood(int amount) {
        food += Math.max(0, amount);
        System.out.println("Добавлено " + amount + " еды в тарелку.");
    }

    void amountOfFood() {
        System.out.println("В тарелке осталось " + food + " еды.");
    }
}
