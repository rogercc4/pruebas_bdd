package pe.gob.sunat.bdd.steps.support;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.ReglasValidadorDeclaracionService;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.ReglasValidadorDeclaracionServiceImpl;

@Component
@Scope("cucumber-glue")
public class ValidadorDatosDeclaracionSupport {

	private Declaracion declaracion;
	
	public String validarDireccionConsignatario() {
		ReglasValidadorDeclaracionService reglaVal = new ReglasValidadorDeclaracionServiceImpl();
		
		List<Map<String, String>> lstMsgErrors = reglaVal.validarDireccionConsignatario(declaracion);
		
		boolean hayMsgErrors = !lstMsgErrors.isEmpty();
		
		if ( hayMsgErrors ) {
			return lstMsgErrors.get(0).get("msg");
		}
		
		return null;
	}
	
	
	public String validarPaisDestino() {
		ReglasValidadorDeclaracionService reglaVal = new ReglasValidadorDeclaracionServiceImpl();
		
		List<Map<String, String>> lstMsgErrors = reglaVal.validarPaisDestino(declaracion);
		
		boolean hayMsgErrors = !lstMsgErrors.isEmpty();
		
		if ( hayMsgErrors ) {
			return lstMsgErrors.get(0).get("msg");
		}
		
		return null;
	}

	public Declaracion getDeclaracion() {
		return declaracion;
	}

	public void setDeclaracion(Declaracion declaracion) {
		this.declaracion = declaracion;
	} 
	
	
	
	
}
