package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Lanes {
    private List<Truck> trucks;
    private static final int MAX_CAPACITY = 5;


    public Lanes() {
        trucks = new ArrayList<>();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Dumpa Mera ---");
            System.out.println("1. See parked trucks");
            System.out.println("2. Register new unloading truck");
            System.out.println("3. End");
            System.out.print("Select from the list: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayParkedTrucks();
                    break;
                case 2:
                    registerTruck();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }


    private void displayParkedTrucks() {
        System.out.println("\nParked trucks:");

        if (trucks.isEmpty()) {
            System.out.println("No trucks parked.");
        } else {
            for (Truck truck : trucks) {
                System.out.println(truck.getBerth() + " - " + truck.getType() + " [" + truck.getWeight() + "kg]");
            }
        }
    }


    private void registerTruck() {
        Scanner scanner = new Scanner(System.in);
        String type;
        int weight;

        System.out.println("\nType of truck:");
        System.out.println("1. Van");
        System.out.println("2. Light Truck");
        System.out.println("3. Heavy Truck");
        System.out.print("Select from the list: ");
        int truckType = scanner.nextInt();

        System.out.print("Weight of truck: ");
        weight = scanner.nextInt();

        if (trucks.size() >= MAX_CAPACITY) {
            System.out.println("Unfortunately it is full, refer drivers to the station Dumpa mera!");
        } else {
            switch (truckType) {
                case 1:
                    type = "Van";
                    registerVan(weight);
                    break;
                case 2:
                    type = "Light Truck";
                    registerLightTruck(weight);
                    break;
                case 3:
                    type = "Heavy Truck";
                    registerHeavyTruck(weight);
                    break;
                default:
                    System.out.println("Invalid truck type. Truck not registered.");
                    return;
            }

            System.out.println("Truck registered for berth " + trucks.get(trucks.size() - 1).getBerth());
        }
    }


    private void registerVan(int weight) {
        if (trucks.size() < MAX_CAPACITY && (trucks.isEmpty() || trucks.get(trucks.size() - 1).getBerth().equals("A"))) {
            trucks.add(new Truck("Van", weight, "A"));
        } else if (trucks.size() < MAX_CAPACITY && trucks.get(trucks.size() - 1).getBerth().equals("B")) {
            trucks.add(new Truck("Van", weight, "B"));
        }
    }


    private void registerLightTruck(int weight) {
        if (trucks.size() < MAX_CAPACITY && (trucks.isEmpty() || trucks.get(trucks.size() - 1).getBerth().equals("C"))) {
            trucks.add(new Truck("Light Truck", weight, "C"));
        } else if (trucks.size() < MAX_CAPACITY && trucks.get(trucks.size() - 1).getBerth().equals("D")) {
            trucks.add(new Truck("Light Truck", weight, "D"));
        }
    }


    private void registerHeavyTruck(int weight) {
        if (trucks.size() < MAX_CAPACITY && (trucks.isEmpty() || trucks.get(trucks.size() - 1).getBerth().equals("E"))) {
            trucks.add(new Truck("Heavy Truck", weight, "E"));
        } else if (trucks.size() < MAX_CAPACITY && trucks.get(trucks.size() - 1).getBerth().equals("D") && weight < 9000) {
            trucks.add(new Truck("Heavy Truck", weight, "D"));
        }
    }




}


