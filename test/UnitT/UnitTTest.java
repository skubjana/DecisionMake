/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package UnitT;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skubjana
 */
public class UnitTTest {
   
    UnitT nm = new UnitT();
    

    @Test
    public void testCheckUsername() {
        
        String lname = "Dani_";
        
        boolean tname = nm.CheckUsername(lname);
        
        assertEquals(true, tname);
    }
    
}
