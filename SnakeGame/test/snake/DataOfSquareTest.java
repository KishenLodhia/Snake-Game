/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.util.ArrayList;
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
public class DataOfSquareTest {
    
    public DataOfSquareTest() {
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
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() {
        System.out.println("lightMeUp with three colors");
        
        ArrayList<Color> C =new ArrayList<Color>();
        
        C.add(Color.darkGray);//0
        C.add(Color.BLUE);//1
        C.add(Color.white);//2
        

        DataOfSquare instance = new DataOfSquare(C.indexOf(Color.darkGray)) ;
        instance.lightMeUp(0);
        
        instance = new DataOfSquare(C.indexOf(Color.BLUE)) ;
        instance.lightMeUp(1);
        
        instance = new DataOfSquare(C.indexOf(Color.white)) ;
        instance.lightMeUp(2);
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
