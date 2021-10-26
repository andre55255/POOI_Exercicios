package entities;

public class Car extends Vehicle {

    private long chassis;
    
    public Car() {
        super();
    }

    public long getChassis() {
        return chassis;
    }

    public void setChassis(long chassis) {
        this.chassis = chassis;
    }
    
    @Override
    public String everyoneData() {
        return String.format(
                "Carro - Placa: %s - Cor: %s - Chassi: %d",
                super.getBoard(),
                super.getColor(),
                this.chassis
        );
    }
}