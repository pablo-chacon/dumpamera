import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lanes extends Vehicle {

    List<Vehicle> lanes = Arrays.asList(new Vehicle());


    public List<Vehicle> addVehicle(Vehicle vehicle) {
        lanes.add(vehicle);
        return lanes;
    }



}