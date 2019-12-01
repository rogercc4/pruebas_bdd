package pe.gob.sunat.bdd.steps.support;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class ManageErrorHelper {
	
	java.util.List<ManageErrorHelper.MensajeError> mensajesError = new java.util.ArrayList<ManageErrorHelper.MensajeError>(); 
	
	
	public void addMensajeError(String mensajeError) {
		if ( mensajeError != null ) {
			this.mensajesError.add(new ManageErrorHelper.MensajeError(mensajeError));
		}
	}
	
	public void addMensajeError(String codError, String mensajeError) {
		this.mensajesError.add(new ManageErrorHelper.MensajeError(codError, mensajeError));
	}
	
	public java.util.List<ManageErrorHelper.MensajeError> getMensajesError() {
		return this.mensajesError;
	}
	
	public boolean contieneMensajeError(String mensajeError) {
		
		java.util.Iterator<ManageErrorHelper.MensajeError> itMensajeError = mensajesError.iterator();
		
		while ( itMensajeError.hasNext() ) {
			ManageErrorHelper.MensajeError mngMsgError = itMensajeError.next();
			
			boolean esElMensaje = mensajeError.equals(mngMsgError.getMensaje()); 
			
			if ( esElMensaje ) {
				return true;
			}
			
		}
		
		
		return false;
	}
	
	public boolean contieneMensajeError(String codError, String mensajeError) {
		
		java.util.Iterator<ManageErrorHelper.MensajeError> itMensajeError = mensajesError.iterator();
		
		while ( itMensajeError.hasNext() ) {
			ManageErrorHelper.MensajeError mngMsgError = itMensajeError.next();
			
			boolean esElMensaje = mensajeError.equals(mngMsgError.getMensaje()) && codError.equals(mngMsgError.getCodigo()) ; 
			
			if ( esElMensaje ) {
				return true;
			}
			
		}
		
		return false;
	}	
	
	public static class MensajeError {
		
		private static final String DEFAULT_MSG_ERROR = "9999";
		
		private String codigo;
		private String mensaje;
		
		
		public MensajeError(String mensajeError) {
			this.codigo = DEFAULT_MSG_ERROR;
			this.mensaje = mensajeError;
		}		
		
		public MensajeError(String codError, String mensajeError) {
			this.codigo = codError;
			this.mensaje = mensajeError;
		}				
		
		public String getCodigo() {
			return codigo;
		}

		public String getMensaje() {
			return mensaje;
		}		
	}
	
}
