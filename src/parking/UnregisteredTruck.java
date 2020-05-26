package parking;

import java.util.Scanner;

public class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand) {
        super(brand);
    }

    @Override
    public int getTollGatePrice() {
        return 5;
    }
}
