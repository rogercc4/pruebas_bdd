package pe.gob.sunat.bdd.steps.definitions;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import pe.gob.sunat.bdd.steps.support.ManageErrorHelper;
import pe.gob.sunat.bdd.steps.support.ValidadorRelacionDocSupport;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.RelacionDocumento;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Solicitud;

public class ValidadorSolicitudSteps {

	@Autowired
	private ValidadorRelacionDocSupport validadorRelacionDocSupport;
	
	@Autowired
	private ManageErrorHelper manageErrorHelper;
	
	@Dado("^que existe una DAM vinculada a una solicitud$")
	public void que_existe_una_DAM_vinculada_a_una_solicitud() throws Throwable {
		this.validadorRelacionDocSupport = new ValidadorRelacionDocSupport();
		RelacionDocumento relacionDoc = new RelacionDocumento();
		relacionDoc.setDeclaracion(new Declaracion());
		relacionDoc.setSolicitud(new Solicitud());
		this.validadorRelacionDocSupport.setRelacionDocumento(relacionDoc);
	}

	@Cuando("^la solicitud Si es uno de los siguientes tipos:$")
	public void la_solicitud_Si_es_uno_de_los_siguientes_tipos(DataTable arg1) throws Throwable {
		int tamanioTabla = arg1.raw().size();	
		Random r = new Random();
		int low = 1;
		int high = tamanioTabla - 1;
		
		int result = r.nextInt(high-low) + low;
		
		String codTipoSolic = arg1.raw().get(result).get(0);
		
		this.validadorRelacionDocSupport.getRelacionDocumento().getSolicitud().setCodTipoSolic(codTipoSolic);
	}

	@Cuando("^la solicitud Si tiene uno de los siguientes estados:$")
	public void la_solicitud_Si_tiene_uno_de_los_siguientes_estados(DataTable arg1) throws Throwable {
		int tamanioTabla = arg1.raw().size();	
		Random r = new Random();
		int low = 1;
		int high = tamanioTabla - 1;
		
		int result = r.nextInt(high-low) + low;
		
		String codEstado = arg1.raw().get(result).get(0);
		
		this.validadorRelacionDocSupport.getRelacionDocumento().getSolicitud().setCodEstado(codEstado);
	}

	@Cuando("^la solicitud No tiene uno de los siguientes estados:$")
	public void la_solicitud_No_tiene_uno_de_los_siguientes_estados(DataTable arg1) throws Throwable {
		this.validadorRelacionDocSupport.getRelacionDocumento().getSolicitud().setCodEstado("123456");
	}

	@Cuando("^la solicitud No es uno de los siguientes tipos:$")
	public void la_solicitud_No_es_uno_de_los_siguientes_tipos(DataTable arg1) throws Throwable {
		this.validadorRelacionDocSupport.getRelacionDocumento().getSolicitud().setCodTipoSolic("123456");
	}
	
	@Cuando("^se valida el tipo y estado de la solicitud al rectificar la DAM$")
	public void se_valida_el_tipo_y_estado_de_la_solicitud_al_rectificar_la_DAM() throws Throwable {
		String mensajeError = this.validadorRelacionDocSupport.validarSolicitudRectificacionPendiente();
		this.manageErrorHelper.addMensajeError(mensajeError);
	}
	
}
