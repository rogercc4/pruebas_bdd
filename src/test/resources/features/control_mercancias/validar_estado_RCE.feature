# language: es
@REQ-20
Característica: Validar el estado de la RCE antes de registrar el RIP/RIA

Con el fin de validar la información antes de registrar en RIP/RIA 
como un operador de comercio exterior 
deseo validar el estado de la Relación de carga a embarcar (RCE)

	Esquema del escenario: El estado de la RCE no cumple las condiciones para registrar RIP/RIA
			
		Dado que se desea registrar el <RIP o RIA> para una RCE con estado diferente a <cod_estado_RCE>
		Y se valida el estado de la RCE para registrar el <RIP o RIA>
		Entonces se obtiene el mensaje de error <mensaje de error>
		
		 Ejemplos: 
		 |RIP o RIA	| cod_estado_RCE 	|  mensaje de error 																																													|
		 |	RIP			| "03" 						|  "RCE no se encuentra en estado 03-Salida Autorizada del recinto con destino al puerto / puesto de control" |
		 |	RIA			| "05" 						|  "RCE no se encuentra en estado de 05-Embarque Autorizado" 																									|