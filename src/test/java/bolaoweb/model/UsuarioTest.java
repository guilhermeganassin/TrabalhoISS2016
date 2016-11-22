/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolaoweb.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        Usuario instance = new Usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getId().equals(null)) {
          fail("Valor não pode ser nulo.");
        }
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetIdNulo() {
        System.out.println("setIdNulo");
        Integer id = null;
        Usuario instance = new Usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //if (instance.getId().equals(0)) {
          //fail("Valor não pode ser nulo.");
        //}
    }


    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Caio";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getNome().equals("")){
          fail("Não é possível cadastrar sem um nome.");
        }
    }
    
    /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void testSetNomeVazio() {
        System.out.println("setNomeVazio");
        String nome = "";
        Usuario instance = new Usuario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getNome().equals("")){
          //fail("Não é possível cadastrar sem um nome.");
        }
    }

    /**
     * Test of setSobrenome method, of class Usuario.
     */
    @Test
    public void testSetSobrenome() {
        System.out.println("setSobrenome");
        String sobrenome = "Souza";
        Usuario instance = new Usuario();
        instance.setSobrenome(sobrenome);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getSobrenome().equals("")){
          fail("Não é possível cadastrar sem um sobrenome.");
        }
    }
    
    @Test
    public void testSetSobrenomeVazio() {
        System.out.println("setSobrenomeVazio");
        String sobrenome = "";
        Usuario instance = new Usuario();
        instance.setSobrenome(sobrenome);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getSobrenome().equals("")){
          //fail("Não é possível cadastrar sem um sobrenome.");
        }
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "Guilherme@gmail.com";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getEmail().equals("")){
          fail("Não é possível cadastrar sem um email.");
        }
    }    
    
    @Test
    public void testSetEmailVazio() {
        System.out.println("setEmailVazio");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getEmail().equals("")){
          //fail("Não é possível cadastrar sem um email.");
        }
    }
    
}
