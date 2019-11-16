# language: es
@REQ-20
Característica: Validar el estado de la RCE antes de registrar el RIP/RIA

Con el fin de validar la información antes de registrar en RIP/RIA 
como un operador de comercio exterior 
deseo validar el estado de la Relación de carga a embarcar (RCE)

	Esquema del escenario: RCE no cumple las condiciones para registrar RIP/RIA
		
		Dado que para la RCE <numero de RCE> corresponde registrar el <RIP o RIA>
		Y la RCE <numero de RCE> no tiene el estado <cod_estado_RCE>
		Entonces se obtiene el mensaje de error <mensaje de error>
		
		 Ejemplos: 
		 |RIP o RIA	| numero de RCE 	| cod_estado_RCE 	|  mensaje de error 																																													|
		 |	RIP			| "118-2019-567" 	| "03" 						|  "RCE no se encuentra en estado 03-Salida Autorizada del recinto con destino al puerto / puesto de control" |
		 |	RIA			| "118-2019-568" 	| "05" 						|  "RCE no se encuentra en estado de 05-Embarque Autorizado" 																									|