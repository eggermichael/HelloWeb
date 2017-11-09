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

    BMIHandler instance;

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
        instance = new BMIHandler();
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
        Double expectedResult = 25.0;
        instance.setWeight(100.0);
        instance.setHeight(200.0);
        Double result = instance.getBmi();
        assertEquals(result, expectedResult);
        System.out.println(result);
    }
}
