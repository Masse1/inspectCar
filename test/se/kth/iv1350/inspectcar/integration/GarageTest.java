/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.inspectcar.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author masaralmosawi
 */
public class GarageTest {
    
    public GarageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of nextInspection method, of class Garage.
     */
    @Test
    public void testNextInspection() {
     
        Garage garage = new Garage();
        garage.nextInspection();
        boolean open = garage.closeDoor();
        if(!(open == true)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of closeDoor method, of class Garage.
     */
    @Test
    public void testCloseDoor() {
    
        Garage door = new Garage();
         door.closeDoor();
         boolean openDoor= door.closeDoor();
         if(!(openDoor == false))
         
         
        fail("The test case is a prototype.");
    }
    
}
