/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.inspectcar.model;

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
public class creditCardTest {
    
    public creditCardTest() {
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
     * Test of setCVC method, of class creditCard.
     */
    @Test
    public void testSetCVC() {
        System.out.println("setCVC");
        int CVC = 0;
        creditCard instance = null;
        instance.setCVC(CVC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class creditCard.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        String number = "";
        creditCard instance = null;
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCholder method, of class creditCard.
     */
    @Test
    public void testSetCholder() {
        System.out.println("setCholder");
        String Cholder = "";
        creditCard instance = null;
        instance.setCholder(Cholder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpDate method, of class creditCard.
     */
    @Test
    public void testSetExpDate() {
        System.out.println("setExpDate");
        String expDate = "";
        creditCard instance = null;
        instance.setExpDate(expDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
