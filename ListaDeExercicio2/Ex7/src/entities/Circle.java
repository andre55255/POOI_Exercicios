package entities;

public class Circle extends Figure {

    private double radius;
    
    public Circle() {
        super();
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return 3.14 * Math.pow(this.radius, 2);
    }
    
    @Override
    public String toString() {
        return String.format(
                "\nTipo: Círculo\nCor: %s\nRaio: %.2f\nÁrea: %.2f",
                super.getColor(),
                this.radius,
                this.area()
        );
    }
}