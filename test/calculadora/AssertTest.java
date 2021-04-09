/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Date;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Javier
 */
public class AssertTest {
    
    String s1 ;
    String s2 ;
        
    Date date1;
    Date date2;
    
    Integer array1[] = {1,2,3};
    Integer array2[] = {4,5,6};
    
    
    public AssertTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Before
    public void Before() {
        s1 = "Hola";
        s2 = "Hola";
        
        date1 = new Date();
        date2 = new Date();
        
        
    }
    
    
    @After
    public void After() {
        s1 = "-";
        s2 = "-";
        
        date1 = null;
        date2 = null;
    }
    
    @Test
    public void tetsEqualsObject() {       
        assertEquals("Los objetos cadenas s1 y s2 no son iguales",s1, s2);
    }
    
    @Test
    public void testEqualsArray() {
        
 
        assertArrayEquals("Los arrays de enteros son distintos", array1, array2);
        
    }
}
