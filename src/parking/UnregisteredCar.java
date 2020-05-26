package parking;

public class UnregisteredCar extends Car implements TollGatePayable{

    public UnregisteredCar(String brand) {
        super(brand);
    }

    @Override
    public int getTollGatePrice() {
        return 3;
    }
}
