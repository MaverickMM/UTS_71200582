package org.Vehicle;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String FuelType, int capacity) {
        setFuelType(FuelType);
        setCapacity(capacity);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
