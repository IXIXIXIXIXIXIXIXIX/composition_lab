import components.ElectricEngine;
import components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car car;
    private ElectricEngine electricEngine;
    private ElectricCar electricCar;
    private PetrolEngine petrolEngine;
    private Customer customer;

    @Before
    public void before(){

        dealership = new Dealership(100000.00);
        petrolEngine = new PetrolEngine();
        electricEngine = new ElectricEngine();
        electricCar = new ElectricCar(30000.00, "blue", electricEngine);
        car = new Car(10000.00, "red", petrolEngine);
        customer = new Customer(15000.00);
    }

    @Test
    public void canAddVehicle() {

        dealership.addVehicle(electricCar);
        dealership.addVehicle(car);
        assertEquals(2, dealership.getStockSize());
    }

    @Test
    public void canSellVehicle(){

        dealership.addVehicle(electricCar);
        dealership.addVehicle(car);

        dealership.sellVehicle(customer);

        assertEquals(1, dealership.getStockSize());
        assertEquals(1, customer.getNumberOfVehicles());
        assertEquals(5000.00, customer.getMoney(), 0.01);
        assertEquals("red", customer.getVehicles().get(0).getColour());
    }

    @Test
    public void canBuyVehicle() {

        dealership.buyVehicle(car);
        assertEquals(1, dealership.getStockSize());
        assertEquals(90000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canRepairVehicle() {

        car.addDamage(1000.00);
        dealership.repair(car);
        assertEquals(10000.00, car.getPrice(), 0.01);

    }
}
