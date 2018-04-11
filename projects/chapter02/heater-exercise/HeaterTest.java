

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HeaterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeaterTest
{
    /**
     * Default constructor for test class HeaterTest
     */
    public HeaterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test()
    {
        Heater heater1 = new Heater();
        assertEquals(15, heater1.getTemperature());
        heater1.warmer();
        heater1.warmer();
        assertEquals(25, heater1.getTemperature());
        heater1.cooler();
        assertEquals(20, heater1.getTemperature());
        heater1.setIncrement(10);
        assertEquals(20, heater1.getTemperature());
        heater1.cooler();
        assertEquals(10, heater1.getTemperature());
        heater1.cooler();
        assertEquals(0, heater1.getTemperature());
        heater1.cooler();
        assertEquals(0, heater1.getTemperature());
        heater1.warmer();
        heater1.warmer();
        heater1.warmer();
        assertEquals(30, heater1.getTemperature());
        heater1.warmer();
        assertEquals(40, heater1.getTemperature());
        heater1.warmer();
        heater1.warmer();
        assertEquals(50, heater1.getTemperature());
        assertEquals(50, heater1.getTemperature());
        heater1.warmer();
        assertEquals(50, heater1.getTemperature());
        heater1.setIncrement(-5);
        assertEquals(50, heater1.getTemperature());
        heater1.cooler();
        heater1.cooler();
        assertEquals(30, heater1.getTemperature());
        heater1.cooler();
        heater1.cooler();
        assertEquals(10, heater1.getTemperature());
    }
}

