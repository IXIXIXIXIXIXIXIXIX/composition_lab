package componentsTests;

import components.HybridEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridEngineTest {

    private HybridEngine hybridEngine;

    @Before
    public void before() {

        hybridEngine = new HybridEngine();

    }

    @Test
    public void hasType() {
        assertEquals("Hybrid", hybridEngine.getEngineType());
    }
}
