/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Javier
 */
public class CalculadoraABIT {
    
    private CalculadoraAB instance; 
    
    public CalculadoraABIT() {
    }
    
    @Before
    public void Before() {
        System.out.println("@Before -> Before");
        instance = new CalculadoraAB();
    }
    
    @After
    public void After() {
        System.out.println("@After -> After");
        instance.clear();
        instance = null;
    }

    /**
     * Test of add method, of class CalculadoraAB.
     */
    @Test
    public void testAdd_int_int() {
        System.out.println("add int int");
        int a = 0;
        int b = 0;
        
        int expResult = 0;
        int result = this.instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class CalculadoraAB.
     */
    @Test
    public void testSub_int_int() {
        System.out.println("sub  int int");
        int a = 0;
        int b = 0;
        
        int expResult = 0;
        int result = instance.sub(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CalculadoraAB.
     */
    @Test
    public void testAdd_int() {
        System.out.println("add int");
        int v = 0;
        
        int expResult = 0;
        int result = instance.add(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class CalculadoraAB.
     */
    @Test
    public void testSub_int() {
        System.out.println("sub int");
        int v = 0;
        
        int expResult = 0;
        int result = instance.sub(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ans method, of class CalculadoraAB.
     */
    @Test
    public void testAns() {
        System.out.println("ans");
        
        int expResult = 0;
        int result = instance.ans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class CalculadoraAB.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
