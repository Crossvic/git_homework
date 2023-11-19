package Task_2;

public interface Figure {

    double calculatePerimeter();

    double calculateArea();

    String getFillColor();

    String getBorderColor();

    default void displayInfo() {
        System.out.println("Shape Type: " + this.getClass().getSimpleName());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill Color: " + getFillColor());
        System.out.println("Border Color: " + getBorderColor());
        System.out.println();
    }
}
