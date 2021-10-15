/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Absar
 */
public class SquarePanelTest {

    public SquarePanelTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ChangeColor method, of class SquarePanel.
     */
    @Test
    public void testChangeColor() {
        System.out.println("ChangeColor");
        Color d = null;
        SquarePanel instance = new SquarePanel();
        instance.ChangeColor(d);
    }

}
