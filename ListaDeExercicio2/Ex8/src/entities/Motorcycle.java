package entities;

public class Motorcycle extends Vehicle {

    private int displacement;

    public Motorcycle() {
        super();
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String everyoneData() {
        return String.format(
                "Moto - Placa: %s - Cor: %s - Cilindradas: %d",
                super.getBoard(),
                super.getColor(),
                this.displacement
        );
    }
    
}