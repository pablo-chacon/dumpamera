package org.example;

public class Truck {

    private String type;
    private int weight;
    private String berth;


    public Truck(String type, int weight, String berth) {
        this.type = type;
        this.weight = weight;
        this.berth = berth;
    }


    public String getType() {
        return type;
    }


    public int getWeight() {
        return weight;
    }


    public String getBerth() {
        return berth;
    }
}
