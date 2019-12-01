package pe.gob.sunat.controladuanero2.salida.mercancia.service;

public class ConsultaDatosDeclaracion {

	public String getDescripcionRegimen(String codRegimen) {
		java.util.Map<String, String> mapRegimenes = new java.util.HashMap<String, String>();
				
		mapRegimenes.put("40", "Exportación definitiva");
		mapRegimenes.put("10", "Importación definitiva");
				
		return mapRegimenes.get(codRegimen);
	}
}
