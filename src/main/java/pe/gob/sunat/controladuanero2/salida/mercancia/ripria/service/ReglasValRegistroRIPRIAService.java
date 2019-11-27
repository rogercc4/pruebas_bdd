package pe.gob.sunat.controladuanero2.salida.mercancia.ripria.service;

import java.util.List;
import java.util.Map;

import pe.gob.sunat.controladuanero2.salida.mercancia.bean.OperacionRipRia;

public interface ReglasValRegistroRIPRIAService {
	   /**<p>La aduana, a&ntilde;o y n&uacute;mero de la RCE debe existir con  estado:</p>
	    * <p>Para el RIP con &quot;03-Salida Autorizada del recinto con destino al puerto / 
	    * puesto  de control&quot;.  De no cumplir, registra el mensaje de error: &ldquo;RCE &lt;Aduana 
	    * de  Presentaci&oacute;n-A&ntilde;odeRCE-N&uacute;merodeRCE&gt; no existe&rdquo; 
	    * o &quot;RCE no se  encuentra en estado 03- Salida  Autorizada del recinto con destino 
	    * al puerto / puesto de control&rdquo; y se detiene el procesamiento. <em><u>RN5505,  
	    * RN5524</u></em></p>
	    * 
	    * <p>Para el RIA con estado  &lsquo;05&rsquo;. De no cumplir, registra el mensaje de 
	    * error: RCE &lt;Aduana de  Presentaci&oacute;n-A&ntilde;odeRCE-
	    * N&uacute;merodeRCE&gt; no existe o &ldquo;RCE no se encuentra en estado de 
	    * 05-<em>Embarque Autorizado</em>&rdquo; y se detiene el  procesamiento. </p>
	    * 
	    * @param envioRIPRIA Informaci&oacute;n de env&iacute;o del RIP/RIA
	    * @return
	    * <ul>
	    *     <li>Si se cumplen las condiciones, se retorna una lista vac&iacute;a.</li>
	    *     <li>Si no se cumplen las condiciones, se retorna una lista con los respectivos mensajes de error  </li>
	    * </ul> */
	   List<Map<String, String>> validarEstadoRCE(OperacionRipRia envioRIPRIA);
}
