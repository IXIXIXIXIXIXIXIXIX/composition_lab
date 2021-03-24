package componentsTests;

import components.ElectricEngine;
import components.Engine;
import components.HybridEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {

    private ElectricEngine electricEngine;

    @Before
    public void before() {

        electricEngine = new ElectricEngine();

    }

    @Test
    public void hasType() {
        assertEquals("Electric", electricEngine.getEngineType());
    }
}
