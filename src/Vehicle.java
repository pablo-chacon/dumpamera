public class Vehicle {

    private String vehicle;
    private int weight;
    public String lane;

    public Vehicle() {
    }

    public Vehicle(String vehicle, int weight) {
        this.lane = lane;
        this.vehicle = vehicle;
        this.weight = weight;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }
}
