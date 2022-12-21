
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

    static String laneOfChoice;
    static List<String> lanes;
    static Lanes lane;
    public static void main(String[] args) {


        boolean appRunning = true;
        lanes = new ArrayList<>();


        while (appRunning) {

            mainMenu();
            int choice = inputInt();

            if (choice == 1) {

                Vehicle vehicle = new Vehicle();

                vehicleMenu();

                int vehicleType = inputInt();

                if (vehicleType == 1) {

                    vehicle.setVehicle("Van");
                    System.out.println("Input weight: > ");
                    vehicle.setWeight(inputInt());

                    System.out.println("Available lanes: A/B.");
                    laneOfChoice = inputStr().toLowerCase();

                    if (laneOfChoice.contains("a")) {

                        vehicle.setLane("A");
                        System.out.println("Proceed to lane A.");

                    } else if (laneOfChoice.contains("b")) {

                        vehicle.setLane("B");
                        System.out.println("Proceed to lane B.");

                    } else {

                        System.out.println("Invalid choice!");
                        choice = 1;

                    }

                    lanes.add(vehicle.toString());
                    System.out.println(vehicle);


                } else if (vehicleType == 2) {

                    vehicle.setVehicle("Small truck");
                    System.out.println("Input weight: > ");
                    vehicle.setWeight(inputInt());

                    if (vehicle.getWeight() < 5000) {

                        vehicle.setLane("A");
                        System.out.println("Proceed to lane A.");

                    } else {

                        System.out.println("Available lanes: C/D");
                        laneOfChoice = inputStr().toLowerCase();


                        if (laneOfChoice.contains("c")) {

                            vehicle.setLane("C");
                            System.out.println("Proceed to lane C.");

                        } else if (laneOfChoice.contains("d")) {

                            vehicle.setLane("D");
                            System.out.println("Proceed to lane D.");

                        } else {

                            Application.main(null);

                        }

                        lanes.add(vehicle.toString());

                    }

                } else if (vehicleType == 3) {

                    vehicle.setVehicle("Heavy truck");
                    System.out.println("Input weight: > ");
                    vehicle.setWeight(inputInt());

                    if (vehicle.getWeight() < 9000) {

                        vehicle.setLane("D");
                        System.out.println("Proceed to lane D.");

                    } else if (vehicle.getWeight() > 9000) {

                        vehicle.setLane("E");
                        System.out.println("Proceed to lane E.");

                    } else {

                        System.out.println("Invalid input!");

                    }
                }
                lanes.add(vehicle.toString());
            } else if (choice == 2) {

                System.out.println(lanes);

            } else if (choice == 3) {

                System.out.println("exit");
                appRunning = false;

            } else {

                System.out.println("Invalid choice.");

            }
        }
    }

    public static String inputStr() {
        Scanner sc = new Scanner(System.in);
        return String.valueOf(sc.nextLine());
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void mainMenu() {
        System.out.println("""
            DumpaMera Menu.
                           
                1. Register new vehicle.
                2. Docked trucks.
                3. Quit program.
                >>> """);

    }

    public static void vehicleMenu() {
        System.out.println("""
            VehicleTypes:
            1. Van
            2. small truck
            3. heavy truck
            >>>""");
    }



}
