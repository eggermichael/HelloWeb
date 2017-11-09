/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.michaelegger.webapps.bmi_calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mike
 */
public class BMIHandlerTest {
    
    public BMIHandlerTest() {
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
     * Test of getBmi method, of class BMIHandler.
     */
    @Test
    public void testGetBmi() {
        System.out.println("getBmi");
        BMIHandler instance = new BMIHandler();
        Double expResult = null;
        Double result = instance.getBmi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class BMIHandler.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        BMIHandler instance = new BMIHandler();
        Double expResult = null;
        Double result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class BMIHandler.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        Double height = null;
        BMIHandler instance = new BMIHandler();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class BMIHandler.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        BMIHandler instance = new BMIHandler();
        Double expResult = null;
        Double result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class BMIHandler.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        Double weight = null;
        BMIHandler instance = new BMIHandler();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
