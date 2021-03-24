package vehiclesTest;

import components.ElectricEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar car;
    private ElectricEngine electricEngine;
    private Customer customer;
    private Customer poorCustomer;

    @Before
    public void before(){
        electricEngine = new ElectricEngine();
        car = new ElectricCar(10000.00, "red", electricEngine);
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
