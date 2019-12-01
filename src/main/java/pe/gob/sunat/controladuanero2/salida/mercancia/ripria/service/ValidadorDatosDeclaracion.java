package pe.gob.sunat.controladuanero2.salida.mercancia.ripria.service;

public class ValidadorDatosDeclaracion {
	
	public boolean esDireccionValida(String direccion) {

		if ( direccion == null ) {
			return false;
		}
		
		return  direccion.trim().length() >= 5;
	}

}
