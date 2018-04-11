

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TicketMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TicketMachineTest
{
    /**
     * Default constructor for test class TicketMachineTest
     */
    public TicketMachineTest()
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
    public void t1()
    {
        TicketMachine ticketMa1 = new TicketMachine(3);
        Ticket ticket1 = new Ticket(15);
        Ticket ticket2 = new Ticket(20);
        Ticket ticket3 = new Ticket(25);
        ticketMa1.createTicket(ticket1);
        ticketMa1.createTicket(ticket2);
        ticketMa1.createTicket(ticket3);
        ticketMa1.insertMoney(150);
        assertEquals(15, ticketMa1.getPrice());
        ticketMa1.printTicket();
        assertEquals(135, ticketMa1.getBalance());
        ticketMa1.setticketsPriceIndex(1);
        assertEquals(20, ticketMa1.getPrice());
        ticketMa1.printTicket();
        assertEquals(115, ticketMa1.getBalance());
        ticketMa1.setticketsPriceIndex(3);
        ticketMa1.printTicket();
        ticketMa1.setticketsPriceIndex(2);
        ticketMa1.printTicket();
        ticketMa1.setticketsPriceIndex(2);
        assertEquals(25, ticketMa1.getPrice());
        ticketMa1.setticketsPriceIndex(0);
        assertEquals(15, ticketMa1.getPrice());
        assertEquals(15, ticketMa1.getPrice());
        ticketMa1.setticketsPriceIndex(1);
        assertEquals(20, ticketMa1.getPrice());
        ticketMa1.setticketsPriceIndex(2);
        assertEquals(25, ticketMa1.getPrice());
    }
}

