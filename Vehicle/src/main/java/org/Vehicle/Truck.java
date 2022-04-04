package org.Vehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity) {
        setEngine(engine);
        setTransmision(transmision);
        setTire(tire);
        setWheel(wheel);
        setCapacity(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void backward() {

    }

    public void brake() {

    }

    public void forward() {

    }

    public void turnLeft() {

    }

    public void turnRight() {

    }
}
