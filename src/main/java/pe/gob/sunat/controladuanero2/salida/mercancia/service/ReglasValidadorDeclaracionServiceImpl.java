package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import java.util.List;
import java.util.Map;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;

public class ReglasValidadorDeclaracionServiceImpl implements ReglasValidadorDeclaracionService {

	public List<Map<String, String>> validarDireccionConsignatario(Declaracion declaracion) {
		 List<Map<String, String>> mensajesError = new java.util.ArrayList<Map<String,String>>();
		 
		 boolean esPaisZonasFrancas =  Constantes.COD_PAIS_ZONAS_FRANCAS.equals(declaracion.getCodPaisDestino());
		 
		 if ( esPaisZonasFrancas ) {
			 return mensajesError;
		 }
		 
		 ValidadorDatosDeclaracion validadorDatosDcl = new ValidadorDatosDeclaracion();
		 
		 boolean direccionValida = validadorDatosDcl.esDireccionValida(declaracion.getConsignatario().getDireccion());
		 
		 if  ( !direccionValida ) {
			 Map<String, String> mapError = new java.util.HashMap<String, String>();
			 String msgError = "Se debe indicar la dirección del consignatario de la DAM (mínimo 5 caracteres)";
			 mapError.put("cod", "40099");
			 mapError.put("msg", msgError);
			 mensajesError.add(mapError);
		 }
		 
		return mensajesError;
	}

	public List<Map<String, String>> validarPaisDestino(Declaracion declaracion) {
		List<Map<String, String>> mensajesError = new java.util.ArrayList<Map<String,String>>();
		
		ValidadorDatosDeclaracion validadorDatosDcl = new ValidadorDatosDeclaracion();
		
		boolean paisValido = validadorDatosDcl.esPaisValido(declaracion.getCodPaisDestino());
		
		if ( !paisValido ) {
			Map<String, String> mapError = new java.util.HashMap<String, String>();
			 String msgError = "País de destino de la DAM no válido";
			 mapError.put("cod", "40100");
			 mapError.put("msg", msgError);
			 mensajesError.add(mapError);
		}
		
		return mensajesError;
	}	
	
}
