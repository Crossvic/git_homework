package Task_2;

public class Rectangle implements Figure {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public String getFillColor() {
        return this.fillColor;
    }

    @Override
    public String getBorderColor() {
        return this.borderColor;
    }
}
