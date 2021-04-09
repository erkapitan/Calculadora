/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Javier
 */


@RunWith(Parameterized.class)
public class CalculadoraParametrosTest {
    private int a;
    private int b;
    private int exp;
    
    public CalculadoraParametrosTest(int a, int b, int exp) {
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Parameters
    public static Iterable<Object> getData() {
        List<Object> obj = new ArrayList<>();
        
        obj.add (new Object[] {3,1,4});
        obj.add (new Object[] {2,3,5});
        obj.add (new Object[] {3,3,16});
        
        
        return obj;
    }
    
    /**
     * Test of add method, of class CalculadoraAB.
     */
    @Test
    public void testAdd_int_int() {
        CalculadoraAB calc = new CalculadoraAB();
        int result = calc.add(a,b);
        assertEquals(exp, result);
        
        
    }

    /**
     * Test of sub method, of class CalculadoraAB.
     */
    @Test
    public void testSub_int_int() {
    }

    /**
     * Test of add method, of class CalculadoraAB.
     */
    @Test
    public void testAdd_int() {
    }

    /**
     * Test of sub method, of class CalculadoraAB.
     */
    @Test
    public void testSub_int() {
    }

    /**
     * Test of ans method, of class CalculadoraAB.
     */
    @Test
    public void testAns() {
    }

    /**
     * Test of clear method, of class CalculadoraAB.
     */
    @Test
    public void testClear() {
    }
    
}
