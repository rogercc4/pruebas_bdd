package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

public class Declaracion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2859496249975464159L;

	private String codAduana; 
	
	private String codRegimen; 
	
	private Integer anio;
	
	private Integer numero;
	
	private String codPaisDestino;
	
	private Participante consignatario;

	public String getCodAduana() {
		return codAduana;
	}

	public void setCodAduana(String codAduana) {
		this.codAduana = codAduana;
	}

	public String getCodRegimen() {
		return codRegimen;
	}

	public void setCodRegimen(String codRegimen) {
		this.codRegimen = codRegimen;
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

	public String getCodPaisDestino() {
		return codPaisDestino;
	}

	public void setCodPaisDestino(String codPaisDestino) {
		this.codPaisDestino = codPaisDestino;
	}

	public Participante getConsignatario() {
		return consignatario;
	}

	public void setConsignatario(Participante consignatario) {
		this.consignatario = consignatario;
	}
	
}