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
 * @author Thiago
 */
public class ApostadorTest {
    
    public ApostadorTest() {
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
     * Test of setApelido method, of class Apostador.
     */
    @Test
    public void testSetApelidoVazio() {
        System.out.println("setApelidoVazio");
        String apelido = "";
        Apostador instance = new Apostador();
        instance.setApelido(apelido);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getApelido().equals("")){
          //fail("Não é permitido apelida vazio.");
        }
    }
    
    /**
     * Test of setApelido method, of class Apostador.
     */
    @Test
    public void testSetApelido() {
        System.out.println("setApelido");
        String apelido = "Teste";
        Apostador instance = new Apostador();
        instance.setApelido(apelido);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getApelido().equals("")){
          fail("Não é permitido apelida vazio.");
        }
    }

    /**
     * Test of setDatanascimento method, of class Apostador.
     */
    @Test
    public void testSetDatanascimentoNulo() {
        System.out.println("setDatanascimentoNulo");
        Date datanascimento = null;
        Apostador instance = new Apostador();
        instance.setDatanascimento(datanascimento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Não é possível inserir valor nulo para data nascimento.");
    }
    
    /**
     * Test of setDatanascimento method, of class Apostador.
     */
    @Test
    public void testSetDatanascimento() throws ParseException {
        System.out.println("setDatanascimento");
        String data = "01/01/1989";
        SimpleDateFormat Fomato = new SimpleDateFormat("dd/MM/yyyy");
        Date datanascimento = Fomato.parse(data);
        Apostador instance = new Apostador();
        instance.setDatanascimento(datanascimento);
        // TODO review the generated test code and remove the default call to fail.
        if (instance.getDatanascimento().equals(null)){
          fail("Não é possível inserir valor nulo para data nascimento.");
        }        
    }
    
    /**
     * Test of setDatanascimento method, of class Apostador.
     */
    @Test
    public void testSetDatanascimentoFutura() throws ParseException {
        System.out.println("setDatanascimentoFutura");
        String data = "01/01/2100";
        SimpleDateFormat Fomato = new SimpleDateFormat("dd/MM/yyyy");
        Date datanascimento = Fomato.parse(data);
        Apostador instance = new Apostador();
        instance.setDatanascimento(datanascimento);
        // TODO review the generated test code and remove the default call to fail.
        Date hoje = new Date();
        if (hoje.before(instance.getDatanascimento()) ){
          //fail("Não é possível inserir uma valor futuro para data nascimento.");
        }         
    }

    /**
     * Test of setPontuacao method, of class Apostador.
     
    @Test
    public void testSetPontuacao() {
        System.out.println("setPontuacao");
        int Pontuacao = 0;
        Apostador instance = new Apostador();
        instance.setPontuacao(Pontuacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/


		/**
		 * Test of setPosicao method, of class Apostador.
		 
		@Test
		public void testSetPosicao() {
			System.out.println("setPosicao");
			int Posicao = 0;
			Apostador instance = new Apostador();
			instance.setPosicao(Posicao);
			// TODO review the generated test code and remove the default call to fail.
			fail("The test case is a prototype.");
		}*/

		/**
		 * Test of pontua method, of class Apostador.
		 
		@Test
		public void testPontua() {
			System.out.println("pontua");
			Apostador instance = new Apostador();
			instance.pontua();
			// TODO review the generated test code and remove the default call to fail.
			fail("The test case is a prototype.");
		}*/

   
}
