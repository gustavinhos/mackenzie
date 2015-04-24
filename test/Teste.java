/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ex2.Ex2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class Teste {
    
    public Teste() {
    }

    @Test
    public void testCalculaIMC() {
        Ex2 ex =  new Ex2();
        assertEquals(34.602076124567475, ex.calculaIMC(1.70, 100), 0.0);
        assertFalse(ex.calculaIMC(1.70, 100)== 32.90);
        assertTrue(ex.calculaIMC(1.70, 100)== 34.602076124567475);
          }
    
  
    
    
}