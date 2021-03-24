package componentsTests;

import components.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolEngineTest {

    private PetrolEngine petrolEngine;

    @Before
    public void before() {

        petrolEngine = new PetrolEngine();

    }

    @Test
    public void hasType() {
        assertEquals("Petrol", petrolEngine.getEngineType());
    }

}
