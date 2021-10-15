/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.KeyEvent;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Absar
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

    public int keyPressed(KeyEvent e) throws NullPointerException{
        switch(e.getKeyCode()){
            case 39:
                if(ThreadsController.directionSnake!=2)
                    ThreadsController.directionSnake=1;
                break;
            case 38:
                if(ThreadsController.directionSnake!=4)
                    ThreadsController.directionSnake=3;
                break;

            case 37:
                if(ThreadsController.directionSnake!=1)
                    ThreadsController.directionSnake=2;
                break;

            case 40:
                if(ThreadsController.directionSnake!=3)
                    ThreadsController.directionSnake=4;
                break;

            default: break;
        }
        return ThreadsController.directionSnake;
    }

    /**
     * Test of keyPressed method, of class KeyboardListener.
     */

    @Test
    public void KeyboardListener(){
        System.out.println("KeyboardListener");
    }

    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;

        assert false;
        assertEquals(keyPressed(e), ThreadsController.directionSnake);

        e.setKeyCode(KeyEvent.VK_DOWN);
        assertEquals(keyPressed(e), ThreadsController.directionSnake);

        e.setKeyCode(KeyEvent.VK_RIGHT);
        assertEquals(keyPressed(e), ThreadsController.directionSnake);

        e.setKeyCode(KeyEvent.VK_LEFT);
        assertEquals(keyPressed(e), ThreadsController.directionSnake);
    }

    @Test
    public void test()
    {
        System.out.println("Keys pressed tested!");
    }



}

