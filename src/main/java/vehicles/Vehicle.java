package vehicles;

import behaviours.IBuyable;
import components.Engine;
import people.Customer;

public abstract class Vehicle implements IBuyable {

    private double price;
    private String colour;
    private Engine engine;
    private Double damage;

    public Vehicle(double price, String colour, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.damage = 0.00;
    }

    public boolean canBuy(Customer customer) {
        return customer.getMoney() >= getPrice();

    }

    public double getPrice() {
        return this.price < 0 ? 0 : this.price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void addDamage(Double damage) {
        this.damage += damage;
        this.price -= damage;
    }

    public Double getDamage() {
        return damage;
    }

    public void removeDamage() {

        this.price += this.damage;
        this.damage = 0.00;
    }
}
