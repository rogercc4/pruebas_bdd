package pe.gob.sunat.bdd.steps.definitions;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.es.Dado;
import pe.gob.sunat.bdd.steps.support.ManageErrorHelper;
import pe.gob.sunat.bdd.steps.support.ValidadorRipRiaSupport;

public class ValidadorRipRiaSteps {
	
	@Autowired
	ValidadorRipRiaSupport validadorRipRiaSupport;
	
	@Autowired
	private ManageErrorHelper manageErrorHelper;
	
	@Dado("^que se desea registrar el RIP para una RCE con estado diferente a \"(.*?)\"$")
	public void que_se_desea_registrar_el_RIP_para_una_RCE_con_estado_diferente_a(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Dado("^se valida el estado de la RCE para registrar el RIP$")
	public void se_valida_el_estado_de_la_RCE_para_registrar_el_RIP() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.manageErrorHelper.addMensajeError("RCE no se encuentra en estado 03-Salida Autorizada del recinto con destino al puerto / puesto de control");
		
	}

	@Dado("^que se desea registrar el RIA para una RCE con estado diferente a \"(.*?)\"$")
	public void que_se_desea_registrar_el_RIA_para_una_RCE_con_estado_diferente_a(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Dado("^se valida el estado de la RCE para registrar el RIA$")
	public void se_valida_el_estado_de_la_RCE_para_registrar_el_RIA() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.manageErrorHelper.addMensajeError("RCE no se encuentra en estado de 05-Embarque Autorizado");
	}
	
}