package pe.gob.sunat.controladuanero2.salida.mercancia.ripria.service;

import java.util.List;
import java.util.Map;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.OperacionRipRia;
import pe.gob.sunat.controladuanero2.salida.mercancia.bean.RelacionCargaEmbarque;

public class ReglasValRegistroRIPRIAServiceImpl implements ReglasValRegistroRIPRIAService {

	public List<Map<String, String>> validarEstadoRCE(OperacionRipRia envioRIPRIA) {
		
		 List<Map<String, String>> mensajesError = new java.util.ArrayList<Map<String,String>>();
		
		RelacionCargaEmbarque rce = envioRIPRIA.getRelacionCargaEmbarque();
		String codEstadoRCE = rce.getCodEstado();
		
		OperacionRipRia.TipoOperacion tipoOperacion = envioRIPRIA.getTipoOperacion();
		
		ValidadorOperacionRipRia validacionOperRipRia = new ValidadorOperacionRipRia();
		
		String codEstadoRceValido = validacionOperRipRia.getCodEstadoRcePermitido(tipoOperacion);
		
		boolean noEsEstadoRceValido = !codEstadoRceValido.equals(codEstadoRCE);
		
		if ( noEsEstadoRceValido ) {
			Map<String, String> mapError = new java.util.HashMap<String, String>();
			mapError.put("cod", "40098");
			String msgError = "";
			
				if ( "03".equals(codEstadoRceValido) ) {
					msgError = "RCE no se encuentra en estado 03-Salida Autorizada del recinto con destino al puerto / puesto de control";
				}
				
				if ( "05".equals(codEstadoRceValido) ) {
					msgError = "RCE no se encuentra en estado de 05-Embarque Autorizado";
				}
			
			mapError.put("msg", msgError);
			
			mensajesError.add(mapError);
		}
		
		return mensajesError;
	}
	
}
