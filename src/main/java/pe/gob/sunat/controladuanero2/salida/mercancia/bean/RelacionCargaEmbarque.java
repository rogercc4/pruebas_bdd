package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

public class RelacionCargaEmbarque implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 926448587802641793L;

	private String codAduana; 
	
	private Integer anio; 
	
	private Integer numero; 
	
	private String codEstado;

	public String getCodAduana() {
		return codAduana;
	}

	public void setCodAduana(String codAduana) {
		this.codAduana = codAduana;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}
	
}
