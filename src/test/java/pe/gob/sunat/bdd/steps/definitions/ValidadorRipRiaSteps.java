package pe.gob.sunat.bdd.steps.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;

public class ValidadorRipRiaSteps {	
	
	@Dado("^que para la RCE \"(.*?)\" corresponde registrar el RIP$")
	public void que_para_la_RCE_corresponde_registrar_el_RIP(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Para la RCE " + arg1 + " corresponde registrar RIP");		
	}

	@Dado("^que para la RCE \"(.*?)\" corresponde registrar el RIA$")
	public void que_para_la_RCE_corresponde_registrar_el_RIA(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Para la RCE " + arg1 + " corresponde registrar RIA");
	}
	
}