package pe.gob.sunat.bdd.steps.support;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.OperacionRipRia;
import pe.gob.sunat.controladuanero2.salida.mercancia.ripria.service.ReglasValRegistroRIPRIAService;
import pe.gob.sunat.controladuanero2.salida.mercancia.ripria.service.ReglasValRegistroRIPRIAServiceImpl;

@Component
@Scope("cucumber-glue")
public class ValidadorRipRiaSupport {
	
	private OperacionRipRia operacionRipRia;
	
	public String validarEstadoRCE() {
		
		ReglasValRegistroRIPRIAService reglaVal = new ReglasValRegistroRIPRIAServiceImpl();
		List<Map<String, String>> lstMsgErrors = reglaVal.validarEstadoRCE(operacionRipRia);
		
		boolean hayMsgErrors = !lstMsgErrors.isEmpty();
		
		if ( hayMsgErrors ) {
			return lstMsgErrors.get(0).get("msg");
		}
		
		return null;
	}

	public OperacionRipRia getOperacionRipRia() {
		return operacionRipRia;
	}

	public void setOperacionRipRia(OperacionRipRia operacionRipRia) {
		this.operacionRipRia = operacionRipRia;
	}
	
}