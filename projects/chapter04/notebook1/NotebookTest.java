

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NotebookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NotebookTest
{
    /**
     * Default constructor for test class NotebookTest
     */
    public NotebookTest()
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
    public void testnote()
    {
        Notebook notebook1 = new Notebook();
        notebook1.storeNote("wzqtest");
        notebook1.storeNote("1231321");
        notebook1.storeNote("123132122221");
        notebook1.listNotes();
        notebook1.removeNote(0);
        notebook1.listNotes();
        notebook1.showNote(0);
    }
}

