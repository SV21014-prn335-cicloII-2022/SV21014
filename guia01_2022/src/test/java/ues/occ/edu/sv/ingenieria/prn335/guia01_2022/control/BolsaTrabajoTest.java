/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.control;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author Sagastume
 */
public class BolsaTrabajoTest {
    
    public BolsaTrabajoTest() {
    }

    /**
     * Test of getPersona method, of class BolsaTrabajo.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        BolsaTrabajo instance = new BolsaTrabajo();
        ArrayList<Persona> expResult = null;
        ArrayList<Persona> result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
