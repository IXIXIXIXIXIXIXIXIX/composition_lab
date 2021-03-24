package people;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> vehicles;



    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public int getNumberOfVehicles() {
        return this.vehicles.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        this.money -= vehicle.getPrice();
        this.vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
