package se.kth.iv1350.inspectcar.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.iv1350.inspectcar.integration.DatabaseManager;
import se.kth.iv1350.inspectcar.integration.Garage;
import se.kth.iv1350.inspectcar.integration.PaymentAuthorization;
import se.kth.iv1350.inspectcar.model.Counter;

public class ControllerTest {

    private DatabaseManager dbMgr;
    private Garage garage;
    private PaymentAuthorization auth;
    private Counter counter;
    private Controller instance;
    private int amount;

    @Before
    public void setUp() {
        dbMgr = new DatabaseManager();
        garage = new Garage();
        auth = new PaymentAuthorization();
        counter = new Counter(amount);
        instance = new Controller(dbMgr, garage, auth, counter);
    }

    @After
    public void tearDown() {
        dbMgr = null;
        garage = null;
        counter = null;
        auth = null;
        instance = null;

    }

    @Test
    public void testCostWhenThereAreInspections() {
        String existingRegNo = "ABC123";
        int expResult = 60;
        int result = instance.enterRegNo(existingRegNo);
        assertEquals("Wrong cost when inspections were found", expResult, result);
    }

    @Test
    public void testCostWhenThereAreNoInspections() {
        String nonExistingRegNo = "ABC124";
        int expResult = 0;
        int result = instance.enterRegNo(nonExistingRegNo);
        assertEquals("Wrong cost when there were no inspections.", expResult, result);
    }
}
