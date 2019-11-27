package pe.gob.sunat.controladuanero2.salida.mercancia.bean;

import java.util.Date;

public class OperacionRipRia implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2055864908289517731L;
	
   /** <p>Fecha y hora de ingreso al puerto/aeropuerto</p> */
   private Date fechaIngreso;
   /** <p>Motivo por el que se hizo la rectificaci&oacute;n y/o anulaci&oacute;n del RIP/RIA</p> */
   private String motivo;
   /** <p>Peso bruto </p> */
   private java.math.BigDecimal pesoBruto;
   /** <p>Peso del veh&iacute;culo</p> */
   private java.math.BigDecimal pesoVehiculo;
   /** <p>Peso del contenedor</p> */
   private java.math.BigDecimal pesoContenedor;
	
	private RelacionCargaEmbarque relacionCargaEmbarque;	
	
	public enum TipoOperacion {RIP, RIA}

	private TipoOperacion tipoOperacion;
	
	public TipoOperacion getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(TipoOperacion tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public java.math.BigDecimal getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(java.math.BigDecimal pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public java.math.BigDecimal getPesoVehiculo() {
		return pesoVehiculo;
	}

	public void setPesoVehiculo(java.math.BigDecimal pesoVehiculo) {
		this.pesoVehiculo = pesoVehiculo;
	}

	public java.math.BigDecimal getPesoContenedor() {
		return pesoContenedor;
	}

	public void setPesoContenedor(java.math.BigDecimal pesoContenedor) {
		this.pesoContenedor = pesoContenedor;
	}

	public RelacionCargaEmbarque getRelacionCargaEmbarque() {
		return relacionCargaEmbarque;
	}

	public void setRelacionCargaEmbarque(RelacionCargaEmbarque relacionCargaEmbarque) {
		this.relacionCargaEmbarque = relacionCargaEmbarque;
	}
	
	
	
}
