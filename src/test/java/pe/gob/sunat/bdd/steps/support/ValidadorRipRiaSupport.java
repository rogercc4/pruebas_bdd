package pe.gob.sunat.bdd.steps.support;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class ValidadorRipRiaSupport {
	
	public enum TipoOperacion {
		RIP, 
		RIA;
	}
	
	public boolean correspondeRegistrar(String numeroRCE, ValidadorRipRiaSupport.TipoOperacion tipoOperacion) {
		return false;
	}	
	
	public void colocarEstadoRCE(String codEstado) {
		
	}
	
	public String validarEstadoRCE() {
		return null;
	}
	
}