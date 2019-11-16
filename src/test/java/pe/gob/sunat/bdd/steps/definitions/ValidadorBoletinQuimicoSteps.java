package pe.gob.sunat.bdd.steps.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ValidadorBoletinQuimicoSteps {
	
	@Cuando("^se desea registrar solicitud BQ para DAM \"(.*?)\" con serie (\\d+) no existente$")
	public void se_desea_registrar_solicitud_BQ_para_DAM_con_serie_no_existente(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Cuando("^se desea registrar solicitud BQ para DAM \"(.*?)\" con regimen diferente a \"(.*?)\"$")
	public void se_desea_registrar_solicitud_BQ_para_DAM_con_regimen_diferente_a(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^que el BQ cuenta con una DAM con serie existente$")
	public void que_el_BQ_cuenta_con_una_DAM_con_serie_existente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^que la DAM es del regimen \"(.*?)\"$")
	public void que_la_DAM_es_del_regimen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Entonces("^se genera una solicitud de BQ$")
	public void se_genera_una_solicitud_de_BQ() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
}
