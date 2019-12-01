package pe.gob.sunat.bdd.steps.definitions;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import pe.gob.sunat.bdd.steps.support.ManageErrorHelper;
import pe.gob.sunat.bdd.steps.support.ValidadorSolicitudBQSupport;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.SolicitudBQ;

public class ValidadorBoletinQuimicoSteps {
	
	@Autowired
	private ValidadorSolicitudBQSupport validadorSolicitudBQSupport;
	
	@Autowired
	private ManageErrorHelper manageErrorHelper;
	
	
	@Cuando("^se desea registrar solicitud BQ para una DAM con serie no existente$")
	public void se_desea_registrar_solicitud_BQ_para_una_DAM_con_serie_no_existente() throws Throwable {
		SolicitudBQ solicitudBQ = new SolicitudBQ();
		Declaracion declaracion = new Declaracion();
		declaracion.setCodAduana("118");
		declaracion.setCodRegimen("40");
		declaracion.setAnio(2019);
		declaracion.setNumero(9999);
		
		solicitudBQ.setDeclaracion(declaracion);
		solicitudBQ.setNumeroSerie(1);
		
		this.validadorSolicitudBQSupport.setSolicitudBQ(solicitudBQ);	
	}

	@Cuando("^se valida que la DAM y serie exista$")
	public void se_valida_que_la_DAM_y_serie_exista() throws Throwable {
		String mensajeError = this.validadorSolicitudBQSupport.validarExisteDeclaracion();
		this.manageErrorHelper.addMensajeError(mensajeError);
	}

	@Cuando("^se desea registrar solicitud BQ para DAM con regimen diferente a exportacion definitiva$")
	public void se_desea_registrar_solicitud_BQ_para_DAM_con_regimen_diferente_a_exportacion_definitiva() throws Throwable {
		SolicitudBQ solicitudBQ = new SolicitudBQ();
		Declaracion declaracion = new Declaracion();
		declaracion.setCodAduana("118");
		declaracion.setCodRegimen("10");
		declaracion.setAnio(2019);
		declaracion.setNumero(9999);
		
		solicitudBQ.setDeclaracion(declaracion);
		solicitudBQ.setNumeroSerie(1);
		
		this.validadorSolicitudBQSupport.setSolicitudBQ(solicitudBQ);
	}

	@Cuando("^se valida que el regimen sea exportacion definitiva$")
	public void se_valida_que_el_regimen_sea_exportacion_definitiva() throws Throwable {
		String mensajeError = this.validadorSolicitudBQSupport.validarRegimenDeclaracion("40");
		this.manageErrorHelper.addMensajeError(mensajeError);
	}

	@Dado("^que el BQ cuenta con una DAM con serie existente$")
	public void que_el_BQ_cuenta_con_una_DAM_con_serie_existente() throws Throwable {
		SolicitudBQ solicitudBQ = new SolicitudBQ();
		Declaracion declaracion = new Declaracion();
		declaracion.setCodAduana("118");
		declaracion.setCodRegimen("40");
		declaracion.setAnio(2019);
		declaracion.setNumero(450);
		
		solicitudBQ.setDeclaracion(declaracion);
		solicitudBQ.setNumeroSerie(1);
		
		this.validadorSolicitudBQSupport.setSolicitudBQ(solicitudBQ);
	}

	@Dado("^que la DAM es del regimen \"(.*?)\"$")
	public void que_la_DAM_es_del_regimen(String arg1) throws Throwable {
		Assert.assertTrue(this.validadorSolicitudBQSupport.getSolicitudBQ().getDeclaracion().getCodRegimen().equals(arg1));
	}

	@Entonces("^se genera una solicitud de BQ$")
	public void se_genera_una_solicitud_de_BQ() throws Throwable {
		Assert.assertNotNull(this.validadorSolicitudBQSupport.generarSolicitudBQ());
	}
	
}
