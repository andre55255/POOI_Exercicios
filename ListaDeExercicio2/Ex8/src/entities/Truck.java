package entities;

public class Truck extends Vehicle {

    private int axes;
    private double charge;
    
    public Truck() {
        super();
    }

    public int getAxes() {
        return axes;
    }

    public void setAxes(int axes) {
        this.axes = axes;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
    
    @Override
    public String everyoneData() {
        return String.format(
                "Caminhão - Placa: %s - Cor: %s - Eixos: %d - Carga: %.2f",
                super.getBoard(),
                super.getColor(),
                this.axes,
                this.charge
        );
    }
}