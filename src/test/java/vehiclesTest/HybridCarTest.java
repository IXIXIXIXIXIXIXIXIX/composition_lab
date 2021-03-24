package vehiclesTest;

import components.HybridEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar car;
    private HybridEngine hybridEngine;
    private Customer customer;
    private Customer poorCustomer;

    @Before
    public void before() {
        hybridEngine = new HybridEngine();
        car = new HybridCar(10000.00, "red", hybridEngine);
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
}