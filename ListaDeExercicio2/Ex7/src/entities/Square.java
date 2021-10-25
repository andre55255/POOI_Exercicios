package entities;

public class Square extends Figure {

    private double side;
    
    public Square() {
        super();
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return this.side * this.side;
    }
    
    @Override
    public String toString() {
        return String.format(
                "\nTipo: Quadrado\nCor: %s\nLado: %.2f\nÁrea: %.2f",
                super.getColor(),
                this.side,
                this.area()
        );
    }
}