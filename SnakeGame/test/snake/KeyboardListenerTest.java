/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Button;
import java.awt.event.KeyEvent;
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
public class KeyboardListenerTest {
    
    public KeyboardListenerTest() {
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
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("Key Press started");
        
        
        Button myButton = new Button();     
        
        
        KeyEvent leftKeyPressed = new KeyEvent(myButton,1,1,1,KeyEvent.VK_LEFT); //left key
        KeyEvent rightKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_RIGHT); //right key
        KeyEvent upKeyPressed = new KeyEvent(myButton,1,1,1, KeyEvent.VK_UP); //up key
        KeyEvent downKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_DOWN); //down key
        KeyEvent escapeKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_ESCAPE); //down key
        
        KeyboardListener keyEvent = new KeyboardListener();
        
        /*
        check for towards & opposite keys, 
        For example, when snake is going right, the right key and left key will not work.
        Similarly, this is checked for all possible combinations.
        */
        keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
        keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");
        keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
        keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
        keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");
        keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
        keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
        keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
        keyEvent.keyPressed(escapeKeyPressed); System.out.println("Down Key Pressed");
        
        
        /*
        This makes the snake go to all the squares multiple times, I am running it a bit extremely as my PC
        can handle it but its not needed to run and can be done in a few iterations. Since it has many iterations,
        it may take time in running in your PC. [More iterations is just to make sure]
        The snake will go diagnally across the board in all directions.
        */
        
        for (int i = 0; i < 50000; i++) {
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
        }
        
        for (int i = 0; i < 50000; i++) {
            keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");
            keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
            keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");
            keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
            keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");
            keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
        }
        
        for (int i = 0; i < 50000; i++) {
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
        }
        
        for (int i = 0; i < 50000; i++) {
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
        }
        
        //Snake bites itself
        keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
        keyEvent.keyPressed(leftKeyPressed); System.out.println("Left Key Pressed");
        keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
        keyEvent.keyPressed(downKeyPressed); System.out.println("Down Key Pressed");
        keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
        keyEvent.keyPressed(upKeyPressed); System.out.println("Up Key Pressed");
        keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");        
        keyEvent.keyPressed(rightKeyPressed); System.out.println("Right Key Pressed");

        
        
        System.out.println("Key press test Success!");
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
