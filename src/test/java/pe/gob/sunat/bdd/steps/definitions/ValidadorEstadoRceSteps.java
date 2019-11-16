package pe.gob.sunat.bdd.steps.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;

public class ValidadorEstadoRceSteps {
	
	@Dado("^la RCE \"(.*?)\" no tiene el estado \"(.*?)\"$")
	public void la_RCE_no_tiene_el_estado(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("RCE: " + arg1 );
		System.out.println("Estado: " + arg2 );		
	}
	
}