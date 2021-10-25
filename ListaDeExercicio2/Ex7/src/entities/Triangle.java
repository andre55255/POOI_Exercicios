package entities;

public class Triangle extends Figure {

    private double base;
    private double height;

    public Triangle() {
        super();
    }

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double area() {
        return (this.base * this.height) / 2;
    }
    
    @Override
    public String toString() {
        return String.format(
                "\nTipo: Triângulo\nCor: %s\nBase: %.2f\nAltura: %.2f\nÁrea: %.2f",
                super.getColor(),
                this.base,
                this.height,
                this.area()
        );
    }
}