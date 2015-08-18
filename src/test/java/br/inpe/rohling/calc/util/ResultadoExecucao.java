package br.inpe.rohling.calc.util;

import br.eti.kinoshita.testlinkjavaapi.util.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIClient;

public class ResultadoExecucao implements IConstantes {  
	 
	    public static void reportTestCaseResult(String projetoTeste, String planoTeste, String casoTeste, String nomeBuild, String nota, String resultado) throws TestLinkAPIException, testlink.api.java.client.TestLinkAPIException {  
		
		// Cria uma instância do TestLinkAPIClient para comunicação com o Testlink  
		      TestLinkAPIClient testlinkAPIClient = new TestLinkAPIClient(DEVKEY, URL);  
		      // Submete os resultados para o Testlink  
		      testlinkAPIClient.reportTestCaseResult(projetoTeste, planoTeste, casoTeste, nomeBuild, nota, resultado);  
		
		}   

}
