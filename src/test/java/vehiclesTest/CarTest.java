package vehiclesTest;

import components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;

import java.util.Currency;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private PetrolEngine petrolEngine;
    private Customer customer;
    private Customer poorCustomer;

    @Before
    public void before(){
        petrolEngine = new PetrolEngine();
        car = new Car(10000.00, "red", petrolEngine);
        customer = new Customer(15000.00);
        poorCustomer = new Customer(20.00);
    }

    @Test
    public void canBuyRichCustomer() {

        assertEquals(true, car.canBuy(customer));
    }

    @Test
    public void canBuyPoorCustomer() {

        assertEquals(false, car.canBuy(poorCustomer));
    }

    @Test
    public void canAddDamage() {
        car.addDamage(5000.00);

        assertEquals(5000.00, car.getDamage(), 0.01);
        assertEquals(5000.00, car.getPrice(), 0.01);

        car.addDamage(7000.00);
        assertEquals(0.00, car.getPrice(), 0.01);
    }

    @Test
    public void canRemoveDamage() {

        car.addDamage(5000.00);
        car.removeDamage();

        assertEquals(10000.00, car.getPrice(), 0.01);
        assertEquals(0.00, car.getDamage(), 0.01);

        car.addDamage(20000.00);
        car.removeDamage();
        assertEquals(10000.00, car.getPrice(), 0.01);
        assertEquals(0.00, car.getDamage(),0.01);
    }
}
