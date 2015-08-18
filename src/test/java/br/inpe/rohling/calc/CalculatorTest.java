package br.inpe.rohling.calc;

import org.junit.Before;
import org.junit.Test;

import br.eti.kinoshita.testlinkjavaapi.model.TestCase;
import br.eti.kinoshita.testlinkjavaapi.util.TestLinkAPIException;
import br.inpe.rohling.calc.util.IConstantes;
import br.inpe.rohling.calc.util.ResultadoExecucao;
import testlink.api.java.client.TestLinkAPIResults;

import static org.junit.Assert.*;

public class CalculatorTest extends TestCase implements IConstantes  {
	Calculator cal;
	@Before
	public void setUp(){
		 cal= new Calculator();
	}
	
	@Test
	public void testSum() throws TestLinkAPIException, testlink.api.java.client.TestLinkAPIException{
		String resultado = null;  
		String nota = null; 
		try{
			assertEquals(6, cal.sum(3, 5));	
			resultado = TestLinkAPIResults.TEST_PASSED;  
		}catch (AssertionError e) {  
		    resultado = TestLinkAPIResults.TEST_FAILED;  
		          nota = e.getMessage();  
		           e.printStackTrace();  
		} finally {  
			ResultadoExecucao.reportTestCaseResult(PROJETO, PLANO, CASO_TESTE1, BUILD, nota, resultado);  
		}  
		
	}
}
