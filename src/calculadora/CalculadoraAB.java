/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Javier
 */
public class CalculadoraAB {
    
    private int ans;
    
    public CalculadoraAB () {
        ans = 0;
    }
    
    public int add (int a, int b) {
        this.ans = a + b;
        return ans;
    }
    
    public int sub (int a, int b) {
        this.ans = a - b;
        return ans;
    }
    
    public int add (int v) {
        ans += v;
        return ans;
    }
    
    public int sub (int v) {
        ans -= v;
        return ans;
    }
    
    public int ans () {
        return ans;
    }
    
    public void clear() {
        this.ans = 0;
    }
}
