package pe.gob.sunat.bdd.steps.definitions;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import pe.gob.sunat.bdd.steps.support.ManageErrorHelper;
import pe.gob.sunat.bdd.steps.support.ValidadorDatosDeclaracionSupport;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Participante;

public class ValidadorInformacionDamSteps {
	
	@Autowired
	private ValidadorDatosDeclaracionSupport validadorDatosDeclaracionSupport;
	
	@Autowired
	private ManageErrorHelper manageErrorHelper;
	
	@Dado("^que país destino de DAM es diferente de Zonas francas del Perú$")
	public void que_país_destino_de_DAM_es_diferente_de_Zonas_francas_del_Perú() throws Throwable {
		Declaracion declaracion = new Declaracion();
		declaracion.setCodPaisDestino("PE");
		this.validadorDatosDeclaracionSupport.setDeclaracion(declaracion);
	}

	@Cuando("^la DAM tiene dirección de consignatario \"(.*?)\"$")
	public void la_DAM_tiene_dirección_de_consignatario(String arg1) throws Throwable {
		Participante consignatario = new Participante();
		consignatario.setDireccion(arg1);
		this.validadorDatosDeclaracionSupport.getDeclaracion().setConsignatario(consignatario);
	}

	@Entonces("^la dirección del consignatario de la DAM es válida$")
	public void la_dirección_del_consignatario_de_la_DAM_es_válida() throws Throwable {
		String mensajeError = this.validadorDatosDeclaracionSupport.validarDireccionConsignatario();
		Assert.assertTrue(mensajeError ==  null);
	}
	
	@Cuando("^se valida la direccion del consignatario de la DAM$")
	public void se_valida_la_direccion_del_consignatario_de_la_DAM() throws Throwable {
		String mensajeError = this.validadorDatosDeclaracionSupport.validarDireccionConsignatario();
		this.manageErrorHelper.addMensajeError(mensajeError);
	}
	
	@Cuando("^la DAM tiene país de destino con código \"(.*?)\"$")
	public void la_DAM_tiene_país_de_destino_con_código(String arg1) throws Throwable {
		Declaracion declaracion = new Declaracion();
		declaracion.setCodPaisDestino(arg1);
		this.validadorDatosDeclaracionSupport.setDeclaracion(declaracion);
	}
	
	@Cuando("^se valida el país de destino de la DAM$")
	public void se_valida_el_país_de_destino_de_la_DAM() throws Throwable {
		String mensajeError = this.validadorDatosDeclaracionSupport.validarPaisDestino();
		this.manageErrorHelper.addMensajeError(mensajeError);
	}
	
	
}