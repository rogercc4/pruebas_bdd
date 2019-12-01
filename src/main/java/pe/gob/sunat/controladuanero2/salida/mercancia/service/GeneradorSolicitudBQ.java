package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import java.util.Random;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.SolicitudBQ;

public class GeneradorSolicitudBQ {
	
	public void generarSolicitud(SolicitudBQ solicitud) {
		
		ValidadorDatosDeclaracion validadorDatosDcl = new ValidadorDatosDeclaracion();
		
		boolean noExisteDeclaracion = !validadorDatosDcl.existeDeclaracion(solicitud.getDeclaracion(), solicitud.getNumeroSerie());
		
		boolean esRegimenNoValido = validadorDatosDcl.esRegimenDiferente(solicitud.getDeclaracion(), "40");
		
		if ( noExisteDeclaracion || esRegimenNoValido ) {
			throw new java.lang.IllegalArgumentException("No se cumple validaciones para ingresar BQ");
		}
		
		 Random r = new Random();
		 
		 Long correlativoSol = Double.valueOf((Math.random() * (300000 - 200000)) + 200000).longValue();
		 
		 solicitud.setCorrelativoSolicitud(correlativoSol);
		
	}
	
}
