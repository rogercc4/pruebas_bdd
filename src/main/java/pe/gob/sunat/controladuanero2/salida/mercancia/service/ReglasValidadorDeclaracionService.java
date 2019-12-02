package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import java.util.List;
import java.util.Map;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.RelacionDocumento;

public interface ReglasValidadorDeclaracionService {

	List<Map<String, String>> validarDireccionConsignatario(Declaracion declaracion);
	
	List<Map<String, String>> validarPaisDestino(Declaracion declaracion);
	
	List<Map<String, String>> validarExisteDeclaracion(Declaracion declaracion, Integer numeroSerie);
	
	List<Map<String, String>> validarRegimenIgual(Declaracion declaracion, String codRegimenEsperado);
	
	List<Map<String, String>> validarSolicitudRectificacionPendiente(RelacionDocumento relacionDocumento);
	
}
