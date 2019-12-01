package pe.gob.sunat.bdd.steps.support;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.SolicitudBQ;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.GeneradorSolicitudBQ;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.ReglasValidadorDeclaracionService;
import pe.gob.sunat.controladuanero2.salida.mercancia.service.ReglasValidadorDeclaracionServiceImpl;

@Component
@Scope("cucumber-glue")
public class ValidadorSolicitudBQSupport {

	private SolicitudBQ solicitudBQ;	

	public SolicitudBQ getSolicitudBQ() {
		return solicitudBQ;
	}

	public void setSolicitudBQ(SolicitudBQ solicitudBQ) {
		this.solicitudBQ = solicitudBQ;
	}
	
	public String validarExisteDeclaracion() {
		ReglasValidadorDeclaracionService reglaVal = new ReglasValidadorDeclaracionServiceImpl();
		List<Map<String, String>> lstMsgErrors = reglaVal.validarExisteDeclaracion(this.solicitudBQ.getDeclaracion(), this.solicitudBQ.getNumeroSerie() );
		
		boolean hayMsgErrors = !lstMsgErrors.isEmpty();
		
		if ( hayMsgErrors ) {
			return lstMsgErrors.get(0).get("msg");
		}
		
		return null;
	}
	
	public String validarRegimenDeclaracion(String codRegimenEsperado) {
		ReglasValidadorDeclaracionService reglaVal = new ReglasValidadorDeclaracionServiceImpl();
		List<Map<String, String>> lstMsgErrors = reglaVal.validarRegimenIgual(this.solicitudBQ.getDeclaracion(), codRegimenEsperado);
		
		boolean hayMsgErrors = !lstMsgErrors.isEmpty();
		
		if ( hayMsgErrors ) {
			return lstMsgErrors.get(0).get("msg");
		}
		
		return null;
	}
	
	public Long generarSolicitudBQ() {
		GeneradorSolicitudBQ generador = new GeneradorSolicitudBQ();
		generador.generarSolicitud(this.solicitudBQ);
		return this.solicitudBQ.getCorrelativoSolicitud();	
	}
	
	
}
