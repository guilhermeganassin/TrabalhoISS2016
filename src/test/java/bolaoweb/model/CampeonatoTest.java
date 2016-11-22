/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolaoweb.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class CampeonatoTest {
    
    public CampeonatoTest() {
      Campeonato campeonato = new Campeonato();
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
     * Test of setId method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetIdNulo() {
        System.out.println("setIdNulo");
        Integer id = null;
        Campeonato instance = new Campeonato();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //if (instance.getId().equals(0)) {
          //fail("Valor não pode ser nulo.");
        //}
    }

    /**
     * Test of setId method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        Campeonato instance = new Campeonato();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getId().equals(null)) {
          fail("Valor não pode ser nulo.");
        }
    }
    
    /**
     * Test of setNome method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetNomeVazio() {
        System.out.println("setNomeVazio");
        String nome = "";
        Campeonato instance = new Campeonato();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getNome().equals("")){
          //fail("Não é possível cadastrar sem um nome.");
        }
    }

    /**
     * Test of setNome method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "João";
        Campeonato instance = new Campeonato();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getNome().equals("")){
          fail("Não é possível cadastrar sem um nome.");
        }
        
    }
    
    /**
     * Test of setEscopo method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetEscopoVazio() {
        System.out.println("setEscopoVazio");
        String escopo = "";
        Campeonato instance = new Campeonato();
        instance.setEscopo(escopo);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getEscopo().equals("")){
          //fail("Não é possível cadastrar um escopo vazio.");
        }
        
    }
    
    /**
     * Test of setEscopo method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetEscopo() {
        System.out.println("setEscopo");
        String escopo = "Regional";
        Campeonato instance = new Campeonato();
        instance.setEscopo(escopo);
        // TODO review the generated test code and remove the default call to fail.    
        if (instance.getEscopo().equals("")){
          fail("Não é possível cadastrar um escopo vazio.");
        }
    }

    
    /*
     * Test of setDatainicio method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetDatainicioNulo() {
        System.out.println("setDatainicioNulo");
        Date datainicio = null;
        Campeonato instance = new Campeonato();
        instance.setDatainicio(datainicio);
        // TODO review the generated test code and remove the default call to fail.
        //if (instance.getDatainicio().equals(null)){
          //fail("Não é possível inserir valor nulo para data inicio.");
        //}
        
    }

    /*
     * Test of setDatainicio method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetDatainicio() throws ParseException {
        System.out.println("setDatainicio");
        String data = "01/01/2016";
        SimpleDateFormat Fomato = new SimpleDateFormat("dd/MM/yyyy");
        Date datainicio = Fomato.parse(data);
        Campeonato instance = new Campeonato();
        instance.setDatainicio(datainicio);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getDatainicio().equals(null)){
          fail("Não é possível inserir valor nulo para data inicio.");
        }
        
    }
    
    /**
     * Test of setDatafim method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetDatafimNulo() {
        System.out.println("setDatafimNulo");
        Date datafim = null;
        Campeonato instance = new Campeonato();
        instance.setDatafim(datafim);
        // TODO review the generated test code and remove the default call to fail.
        //if (instance.getDatafim().equals(null)){
          //fail("A data fim não pode ter valor nulo.");
        //}
        
    }
    
    /**
     * Test of setDatafim method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetDatafim() throws ParseException {
        System.out.println("setDatafim");
        
        String data1 = "01/01/2016";
        String data2 = "31/01/2016";
        SimpleDateFormat Fomato = new SimpleDateFormat("dd/MM/yyyy");
        Date datafim = Fomato.parse(data2);
        Date datainicio = Fomato.parse(data1);
        Campeonato instance = new Campeonato();
        instance.setDatafim(datafim);
        instance.setDatainicio(datainicio);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getDatafim().before(instance.getDatainicio())){            
           fail("A data fim não pode ser anterior a dada inicio.");
        }        
    }
    
    /**
     * Test of setDatafim method, of class Campeonato.
     */
    @org.junit.Test
    public void testSetDatafimAnterior() throws ParseException {
        System.out.println("setDatafimAnterior");
        
        String data1 = "01/01/2016";
        String data2 = "31/01/2015";
        SimpleDateFormat Fomato = new SimpleDateFormat("dd/MM/yyyy");
        Date datafim = Fomato.parse(data2);
        Date datainicio = Fomato.parse(data1);
        Campeonato instance = new Campeonato();
        instance.setDatafim(datafim);
        instance.setDatainicio(datainicio);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getDatafim().before(instance.getDatainicio())){            
           //fail("A data fim não pode ser anterior a dada inicio.");
        }        
    }    
    
}
