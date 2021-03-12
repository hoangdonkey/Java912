package Java9.Shape;
public class Rectangle implements Shape {
    private int width, length;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }

    @Override
    public double getArea() {
        return width * length;
    }
}