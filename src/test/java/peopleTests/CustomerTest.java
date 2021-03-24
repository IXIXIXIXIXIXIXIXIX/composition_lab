package peopleTests;

import components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Car car;
    private PetrolEngine petrolEngine;

    @Before
    public void before() {
        customer = new Customer(15000.00);
        petrolEngine = new PetrolEngine();
        car = new Car(10000.00, "red", petrolEngine);

    }

    @Test
    public void hasMoney() {
        assertEquals(15000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canBuyVehicle() {

        customer.buyVehicle(car);
        assertEquals(1, customer.getNumberOfVehicles());

    }

}
