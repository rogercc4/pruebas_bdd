package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import java.util.List;
import java.util.Map;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.RelacionDocumento;

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

	public List<Map<String, String>> validarExisteDeclaracion(Declaracion declaracion, Integer numeroSerie) {
		List<Map<String, String>> mensajesError = new java.util.ArrayList<Map<String,String>>();
		ValidadorDatosDeclaracion validadorDatosDcl = new ValidadorDatosDeclaracion();
		boolean existeDeclaracion = validadorDatosDcl.existeDeclaracion(declaracion, numeroSerie);
		
		if ( !existeDeclaracion ) {
			Map<String, String> mapError = new java.util.HashMap<String, String>();
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			sb.append("No se encontró DAM ");
			sb.append(declaracion.getNumeroCompleto());
			sb.append(" con serie ");
			sb.append(numeroSerie);
			mapError.put("cod", "40101");
			mapError.put("msg", sb.toString());
			mensajesError.add(mapError);
		}
		
		return mensajesError;
	}	
	
	
	public List<Map<String, String>> validarRegimenIgual(Declaracion declaracion, String codRegimenEsperado) {
		List<Map<String, String>> mensajesError = new java.util.ArrayList<Map<String,String>>();
		ValidadorDatosDeclaracion validadorDatosDcl = new ValidadorDatosDeclaracion();
		
		boolean esRegimenDiferente = validadorDatosDcl.esRegimenDiferente(declaracion, codRegimenEsperado);
		
		
		if ( esRegimenDiferente ) {
			ConsultaDatosDeclaracion consulta = new ConsultaDatosDeclaracion();
			
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			sb.append("El régimen de la DAM deber ser ");
			sb.append(codRegimenEsperado);
			sb.append("-");
			sb.append(consulta.getDescripcionRegimen(codRegimenEsperado));
			
			Map<String, String> mapError = new java.util.HashMap<String, String>();
			mapError.put("cod", "40102");
			mapError.put("msg", sb.toString());
			mensajesError.add(mapError);
		}
		
		return mensajesError;	
	}
	
	
	public List<Map<String, String>> validarSolicitudRectificacionPendiente(RelacionDocumento relacionDocumento) {
		List<Map<String, String>> mensajesError = new java.util.ArrayList<Map<String,String>>();
		
		boolean esSolicRecti = Constantes.SOLICITUD_RECTIFICACION_DAM.equals(relacionDocumento.getSolicitud().getCodTipoSolic());
		
		if ( esSolicRecti ) {
			
			ValidadorSolicitud validSolic = new ValidadorSolicitud();
			
			boolean estaPendientesDeAtencion = validSolic.estaPendientesDeAtencion(relacionDocumento.getSolicitud());
			
			if ( estaPendientesDeAtencion ) {
				Map<String, String> mapError = new java.util.HashMap<String, String>();
				mapError.put("cod", "40102");
				mapError.put("msg", "DAM cuenta con solicitud de evaluación previa pendiente");
				mensajesError.add(mapError);
			}
			
		}
		
		return mensajesError;
	}
	
	
}