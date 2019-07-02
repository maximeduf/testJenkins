/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testjenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SuperficieTest {
    
    public SuperficieTest() {
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
     * Test of Carre method, of class Superficie.
     */
    @org.junit.Test
    public void testCarre() {
        System.out.println("Carre");
        double length = 5.0;
        double expResult = 25.0;
        double result = Superficie.Carre(length);
        assertEquals(expResult, result, 0.01);
        
    }
    
    @org.junit.Test
    public void testCarreTestFail() {
        System.out.println("Carre");
        double length = -5.0;
        double expResult = -25.0;
        double result = Superficie.Carre(length);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
