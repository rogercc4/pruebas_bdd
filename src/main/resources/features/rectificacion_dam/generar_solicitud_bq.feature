# language: es
@REQ-18

Característica: Generar la solicitud BQ (Boletín químico) 

Con el fin de que un especialista pueda revisar el resultado del boletín químico
como funcionario aduanero 
deseo generar la solicitud BQ (Boletín químico)			

	Esquema del escenario: No se cumple las validaciones para la generación de solicitud de BQ
	
		Cuando se desea registrar solicitud BQ <condicion DAM>
		Entonces se obtiene el mensaje de error <mensaje_de_error>
		
		Ejemplos: 		
			|	condicion DAM																									|	mensaje_de_error 																						|
			| para DAM "118-2019-40-450" con serie 1 no existente 					| "No se encontró DAM 118-2019-40-450 con serie 1"						|
			| para DAM "118-2019-10-26" con regimen diferente a "40"				| "El régimen de la DAM deber ser 40-Exportación definitiva"	|
	
	Escenario: Se genera correctamente la solicitud de BQ. 
	
		Dado que el BQ cuenta con una DAM con serie existente 
		Dado que la DAM es del regimen "40"
		Entonces se genera una solicitud de BQ