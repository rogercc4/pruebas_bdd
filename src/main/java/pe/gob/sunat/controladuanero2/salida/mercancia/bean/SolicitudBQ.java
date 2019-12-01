package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

public class SolicitudBQ implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8338022314733617754L;
	
	private Long correlativoSolicitud;
	
	private Declaracion declaracion;
	
	private Integer numeroSerie;

	public Declaracion getDeclaracion() {
		return declaracion;
	}

	public void setDeclaracion(Declaracion declaracion) {
		this.declaracion = declaracion;
	}

	public Integer getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(Integer numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Long getCorrelativoSolicitud() {
		return correlativoSolicitud;
	}

	public void setCorrelativoSolicitud(Long correlativoSolicitud) {
		this.correlativoSolicitud = correlativoSolicitud;
	}

}
