# language: es
@REQ-18

Característica: Generar la solicitud BQ (Boletín químico) 

Con el fin de que un especialista pueda revisar el resultado del boletín químico
como funcionario aduanero 
deseo generar la solicitud BQ (Boletín químico)			

	Esquema del escenario: No se cumple las validaciones para la generación de solicitud de BQ
	
	La DAM que se esta colocando y que no existe es la 118-2019-40-9999
	
		Cuando se desea registrar solicitud BQ <condicion DAM> 
		Y se <validacion> 
		Entonces se obtiene el mensaje de error <mensaje_de_error>
		
		Ejemplos: 		
			|	condicion DAM																						|	validacion 																									|	mensaje_de_error 																						|
			| para una DAM con serie no existente 										|	valida que la DAM y serie exista														| "No se encontró DAM 118-2019-40-9999 con serie 1"						|
			| para DAM con regimen diferente a exportacion definitiva	|	valida que el regimen sea exportacion definitiva						| "El régimen de la DAM deber ser 40-Exportación definitiva"	|
	
	Escenario: Se genera correctamente la solicitud de BQ. 
	
		Dado que el BQ cuenta con una DAM con serie existente 
		Y que la DAM es del regimen "40"
		Entonces se genera una solicitud de BQ