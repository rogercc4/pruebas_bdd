package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

public class Solicitud implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9153563027573795642L;
	private Integer numero; 
	private Integer anio; 
	private String codAduana; 
	private String codTipoSolic;
	private String codEstado;
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public String getCodAduana() {
		return codAduana;
	}
	public void setCodAduana(String codAduana) {
		this.codAduana = codAduana;
	}
	public String getCodTipoSolic() {
		return codTipoSolic;
	}
	public void setCodTipoSolic(String codTipoSolic) {
		this.codTipoSolic = codTipoSolic;
	}
	public String getCodEstado() {
		return codEstado;
	}
	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}
	
}
