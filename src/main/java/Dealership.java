import people.Customer;
import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealership(double till) {
        this.till = till;
        stock = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public int getStockSize() {
        return this.stock.size();
    }

    public void sellVehicle(Customer customer){

        Boolean hasSold = false;
        int counter = 0;

        while(!hasSold && counter < this.stock.size())
        {
            if(this.stock.get(counter).canBuy(customer)) {
                customer.buyVehicle(this.stock.get(counter));
                this.stock.remove(counter);
                hasSold = true;
            }
            else {
                ++counter;
            }
        }
    }

    public void buyVehicle(Vehicle vehicle) {

        if(this.till >= vehicle.getPrice())
        {
            this.stock.add(vehicle);
            this.till -= vehicle.getPrice();
        }
    }

    public double getTill() {
        return till;
    }

    public void repair(Vehicle vehicle) {

        if(vehicle.getDamage() <= this.till)
        {
            this.till -= vehicle.getDamage();
            vehicle.removeDamage();
        }
    }
}
