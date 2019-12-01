package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import java.util.List;
import java.util.Map;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;

public interface ReglasValidadorDeclaracionService {

	List<Map<String, String>> validarDireccionConsignatario(Declaracion declaracion);
	
	List<Map<String, String>> validarPaisDestino(Declaracion declaracion);
}
