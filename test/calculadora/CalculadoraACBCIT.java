/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier
 */
public class CalculadoraACBCIT {
    
    private static CalculadoraAB instance; 
    
    public CalculadoraACBCIT() {
    }
    
    @BeforeClass
    public static void BeforeClass() {
        System.out.println("@BeforeClass -> BeforeClass");
        instance = new CalculadoraAB();
    }
    
    @AfterClass
    public static void AfterClass() {
        System.out.println("@AfterClass -> AfterClass");
        
    }
    
    @Before
    public void Before() {
        System.out.println("\t@Before -> Before");
        instance.clear();
    }
    
    @After
    public void After() {
        System.out.println("\t@After -> After");
        
        //instance = null;
    }

    /**
     * Test of add method, of class CalculadoraAB.
     */
    @Test
    public void testAdd_int_int() {
        System.out.println("\t\tadd");
        
        int a = 0;
        int b = 0;
        
        int expResult = 0;
        int result = instance.add(a, b);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class CalculadoraAB.
     */
    @Test
    public void testSub_int_int() {
        System.out.println("\t\tsub");
        int a = 0;
        int b = 0;
        
        int expResult = 0;
        int result = instance.sub(a, b);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CalculadoraAB.
     */
    @Test
    public void testAdd_int() {
        System.out.println("\tadd");
        int v = 0;
        
        int expResult = 0;
        int result = instance.add(v);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class CalculadoraAB.
     */
    @Test
    public void testSub_int() {
        System.out.println("\t\tsub");
        int v = 0;
        
        int expResult = 0;
        int result = instance.sub(v);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ans method, of class CalculadoraAB.
     */
    @Test
    public void testAns() {
        System.out.println("\t\tans");
        
        int expResult = 0;
        
        int result = instance.ans();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class CalculadoraAB.
     */
    @Test
    public void testClear() {
        System.out.println("\t\tclear");
        
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
