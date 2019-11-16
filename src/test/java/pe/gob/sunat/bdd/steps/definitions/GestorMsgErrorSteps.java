package pe.gob.sunat.bdd.steps.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Entonces;

public class GestorMsgErrorSteps {
	
	@Entonces("^se obtiene el mensaje de error \"(.*?)\"$")
	public void se_obtiene_el_mensaje_de_error(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Se obtiene el mensaje de error " + arg1);
	}
	
	@Entonces("^no hay mensajes de error$")
	public void no_hay_mensajes_de_error() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}