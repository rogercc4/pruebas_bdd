package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

public class Participante implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8735539312162301292L;

	private String codTipoDoc; 
	
	private String numeroDoc; 
	
	private String nombres; 
	
	private String direccion;
	
	private String codTipoPartic;

	public String getCodTipoDoc() {
		return codTipoDoc;
	}

	public void setCodTipoDoc(String codTipoDoc) {
		this.codTipoDoc = codTipoDoc;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodTipoPartic() {
		return codTipoPartic;
	}

	public void setCodTipoPartic(String codTipoPartic) {
		this.codTipoPartic = codTipoPartic;
	} 
	
	
	
	
}
