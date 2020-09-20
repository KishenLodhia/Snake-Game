/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kishen Lodhia
 */
public class TupleTest {
    
    public TupleTest() {
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
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        Tuple instance = new Tuple(1,2);
        int x = 0;
        int y = 0;
        instance.ChangeData(x, y);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple instance = new Tuple(1,2);
        int expResult = 1;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple instance = new Tuple(1,2);
        int expResult = 2;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("Success!");

    }

}
