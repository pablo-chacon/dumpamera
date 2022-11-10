
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Lanes lanes = new Lanes();
        Scanner sc = new Scanner(System.in);
        boolean appRunning = true;

        while (appRunning) {

            System.out.println("""
                    DumpaMera Menu.
                                   
                        1. Register new vehicle.
                        2. Docked trucks.
                        3. Quit program.
                        >>> """);


            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("""
                        VehicleTypes:
                        1. Van
                        2. small truck
                        3. heavy truck""");

                Vehicle vehicle = new Vehicle();
                int vehicleType = sc.nextInt();
                if (vehicleType == 1) {
                    vehicle.setVehicle("van");
                    System.out.println("Input weight: > ");
                    vehicle.setWeight(sc.nextInt());

                    System.out.println("Available lanes: \n1. A\n2. B");
                    int laneOfChoice = sc.nextInt();
                    if (laneOfChoice == 1) {
                        vehicle.setLane("A");
                    } else if (laneOfChoice == 2) {
                        vehicle.setLane("B");
                    } else {
                        System.out.println("Invalid choice, program crasching!");
                    }
                            lanes.addLane("vehicle", "weight", "lane").print();
                            lanes.addLane(vehicle.getVehicle(), String.valueOf(vehicle.getWeight()), vehicle.getLane())
                            .print();

                } else if (vehicleType == 2) {

                    vehicle.setVehicle("small truck");
                    System.out.println("Input weight: > ");
                    vehicle.setWeight(sc.nextInt());

                    if (vehicle.getWeight() < 5000) {
                        vehicle.setLane("A");
                    } else {

                        System.out.println("Available lanes:\n1.C\n2.D");
                        int laneOfChoice = sc.nextInt();

                        if (laneOfChoice == 1) {
                            vehicle.setLane("C");
                        } else {
                            vehicle.setLane("D");
                            System.out.println("Invalid choice, program crasching!");
                        }

                    }

                            lanes.addLane("vehicle", "weight", "lane").print();
                            lanes.addLane(vehicle.getVehicle(), String.valueOf(vehicle.getWeight()), vehicle.getLane())
                            .print();
                } else if (vehicleType == 3) {
                    vehicle.setVehicle("Heavy truck");
                    System.out.println("Input weight: > ");
                    vehicle.setWeight(sc.nextInt());

                    if (vehicle.getWeight() < 9000) {
                        vehicle.setLane("D");
                    } else {
                        vehicle.setLane("E");
                    }
                    new Lanes()
                            .addLane("vehicle", "weight", "lane")
                            .addLane(vehicle.getVehicle(), String.valueOf(vehicle.getWeight()), vehicle.getLane())
                            .print();
                }

            } else if (choice == 2) {
                System.out.println(lanes);
            } else if (choice == 3){
                System.out.println("exit");
                appRunning = false;
            } else {
               System.out.println("Invalid choice.");
            }
        }
    }
}
