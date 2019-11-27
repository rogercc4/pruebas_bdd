package pe.gob.sunat.controladuanero2.salida.mercancia.ripria.service;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.OperacionRipRia;

public class ValidadorOperacionRipRia {
	
	public String getCodEstadoRcePermitido(OperacionRipRia.TipoOperacion tipoOperacion ) {		
		String resultado = null;
		
		if ( OperacionRipRia.TipoOperacion.RIA.equals(tipoOperacion) ) {
			resultado = "05";
			return resultado;
		}
		
		if ( OperacionRipRia.TipoOperacion.RIP.equals(tipoOperacion) ) {
			resultado = "03";
			return resultado;
		}	
			
		return resultado;
	}

}