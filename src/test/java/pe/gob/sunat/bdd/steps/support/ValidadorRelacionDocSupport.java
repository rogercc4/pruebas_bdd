package pe.gob.sunat.bdd.steps.support;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.RelacionDocumento;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.ReglasValidadorDeclaracionService;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.ReglasValidadorDeclaracionServiceImpl;

@Component
@Scope("cucumber-glue")
public class ValidadorRelacionDocSupport {

	private RelacionDocumento relacionDocumento;

	public RelacionDocumento getRelacionDocumento() {
		return relacionDocumento;
	}

	public void setRelacionDocumento(RelacionDocumento relacionDocumento) {
		this.relacionDocumento = relacionDocumento;
	}
	
	public String validarSolicitudRectificacionPendiente() {
		ReglasValidadorDeclaracionService reglaVal = new ReglasValidadorDeclaracionServiceImpl();
		
		List<Map<String, String>> lstMsgErors = reglaVal.validarSolicitudRectificacionPendiente(this.relacionDocumento);
		
		boolean hayMsgErrors = !lstMsgErors.isEmpty();
		
		if ( hayMsgErrors ) {
			return lstMsgErors.get(0).get("msg");
		}
		
		return null;
	}
	
}
