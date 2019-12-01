package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Declaracion;

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
	
	
	public boolean existeDeclaracion(Declaracion declaracion, Integer numeroSerie) {
		String separator = "-";
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append(declaracion.getCodAduana());
		sb.append(separator);
		sb.append(declaracion.getAnio());
		sb.append(separator);
		sb.append(declaracion.getCodRegimen());
		sb.append(separator);
		sb.append(declaracion.getNumero());
		sb.append(separator);
		sb.append(numeroSerie);
		
		java.util.List<String> damsSeriesExistentes = new java.util.ArrayList<String>();
		damsSeriesExistentes.add("118-2019-40-450-1");
		damsSeriesExistentes.add("235-2019-40-123-1");
		
		return damsSeriesExistentes.contains(sb.toString());
		
	}
	
	public boolean esRegimenDiferente(Declaracion declaracion, String codRegimen) {
		return !codRegimen.equals(declaracion.getCodRegimen());
	}
}
