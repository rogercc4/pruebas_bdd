package pe.gob.sunat.controladuanero2.salida.mercancia.service;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.Solicitud;

public class ValidadorSolicitud {
	
	public boolean estaPendientesDeAtencion(Solicitud solicitud) {
		java.util.Set<String> estadosPendientes = new java.util.HashSet<String>();
		
		estadosPendientes.add("02");
		estadosPendientes.add("03");
		estadosPendientes.add("04");
		
		return estadosPendientes.contains(solicitud.getCodEstado());
	}
	

}
