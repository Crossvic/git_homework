package Task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Orange");

        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }
}
