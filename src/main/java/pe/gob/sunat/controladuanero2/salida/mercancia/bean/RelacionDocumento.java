package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

public class RelacionDocumento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5171056571461106880L;

	private Solicitud solicitud; 
	
	private Declaracion declaracion;

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public Declaracion getDeclaracion() {
		return declaracion;
	}

	public void setDeclaracion(Declaracion declaracion) {
		this.declaracion = declaracion;
	}
	
	
}
