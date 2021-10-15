/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Absar
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

    /**
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        int x = 20;
        int y = 21;
        Tuple instance = new Tuple();
        instance.ChangeData(x, y);
    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple instance = new Tuple();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple instance = new Tuple();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getXf method, of class Tuple.
     */
    @Test
    public void testGetXf() {
        System.out.println("getXf");
        Tuple instance = new Tuple();
        int expResult = 0;
        int result = instance.getXf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void testGetYf() {
        System.out.println("getYf");
        Tuple instance = new Tuple();
        int expResult = 0;
        int result = instance.getYf();
        assertEquals(expResult, result);
    }

}
