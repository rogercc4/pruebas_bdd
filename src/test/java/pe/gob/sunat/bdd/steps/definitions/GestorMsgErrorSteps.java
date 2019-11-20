package pe.gob.sunat.bdd.steps.definitions;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.es.Entonces;
import pe.gob.sunat.bdd.steps.support.ManageErrorHelper;


public class GestorMsgErrorSteps {
	
	@Autowired
	private ManageErrorHelper manageErrorHelper;
	
	@Entonces("^se obtiene el mensaje de error \"(.*?)\"$")
	public void se_obtiene_el_mensaje_de_error(String mensajeError) throws Throwable {
		Assert.assertTrue(this.manageErrorHelper.contieneMensajeError(mensajeError));
	}
	
	@Entonces("^no hay mensajes de error$")
	public void no_hay_mensajes_de_error() throws Throwable {
		Assert.assertTrue(this.manageErrorHelper.getMensajesError().isEmpty());
	}
	
}