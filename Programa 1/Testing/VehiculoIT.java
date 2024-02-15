/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.trasporte;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HUGO GRANDE
 */
public class VehiculoIT {
    
    public VehiculoIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getplaca method, of class Vehiculo.
     */
    @Test
    public void testGetplaca() {
        System.out.println("getplaca");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getplaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setplaca method, of class Vehiculo.
     */
    @Test
    public void testSetplaca() {
        System.out.println("setplaca");
        String placa = "";
        Vehiculo instance = null;
        instance.setplaca(placa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class Vehiculo.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        Vehiculo instance = null;
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Vehiculo.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Vehiculo instance = null;
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VehiculoImpl extends Vehiculo {

        public VehiculoImpl() {
            super("", null, "");
        }
    }
    
}
