/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author javie
 */

@RunWith (value = Suite.class)
@Suite.SuiteClasses ( {
        CalculadoraIT.class,
        CalculadoraAB.class,
        CalculadoraACBCIT.class,
        CalculadoraParametrosTest.class
    }
)
public class CalculadoraABSuiteTest {
}
