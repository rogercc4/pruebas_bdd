package pe.gob.sunat.controladuanero2.salida.mercancia.service;

public class ValidadorDatosDeclaracion {
	
	public boolean esDireccionValida(String direccion) {

		if ( direccion == null ) {
			return false;
		}
		
		return  direccion.trim().length() >= 5;
	}

	
	public boolean esPaisValido(String codPais) {
		java.util.List<String> paisesValidos = new java.util.ArrayList<String>();
		paisesValidos.add("PE");
		paisesValidos.add("HN");
		paisesValidos.add("JP");
		paisesValidos.add("AR");
		paisesValidos.add("CO");
		
		return paisesValidos.contains(codPais);
	}
	
}
