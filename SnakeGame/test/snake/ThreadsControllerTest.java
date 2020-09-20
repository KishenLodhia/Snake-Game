/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static snake.ThreadsController.directionSnake;

/**
 *
 * @author Kishen Lodhia
 */
public class ThreadsControllerTest {
    
    public ThreadsControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Window instance = new Window();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {
        
        Tuple myTuple = new Tuple(10,10);
        
        //System.out.println("run");
        //ThreadsController instance = new ThreadsController(myTuple);
        //instance.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of moveInterne method, of class ThreadsController.
     */
    @Test
    public void testMoveInterne() {

        ArrayList<ArrayList<DataOfSquare>> Squares= new ArrayList<ArrayList<DataOfSquare>>();
	Tuple headSnakePos;
	int sizeSnake=3;
	long speed = 50;
	int directionSnake ;

	ArrayList<Tuple> positions = new ArrayList<Tuple>();
	Tuple foodPosition;
        
        

        Tuple myTuple = new Tuple(10,10);       
        ThreadsController instance = new ThreadsController(myTuple);
        
        instance.start();
        
        new KeyboardListenerTest().testKeyPressed();
        
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
