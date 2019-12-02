# language: es
@REQ-13
Característica: Validar existencia de solicitudes de rectificación pendientes

Con el fin de rectificar la información de una DAM de exportación de definitiva
como operador de de comercio exterior
deseo que el sistema verifique si hay solicitudes rectificación pendientes de atención.

	Antecedentes: 
		Dado que existe una DAM vinculada a una solicitud
	
		Esquema del escenario: 
		
			Cuando la solicitud <tiene_tipo> es uno de los siguientes tipos:
					
				|	Tipo		|	Descripción											|
				|	40			|	Rectificación de DAM		 				|
				|	46			|	Anulación de DAM								|
				|	47			|	Reversión de anulación de DAM		|
		
			Y la solicitud <tiene_estado> tiene uno de los siguientes estados:
		
				|	Estado	|	Descripción								|
				|	02			|	Por asignar								|
				|	03			|	Asignado con especialista	|
				|	04			|	En proceso de evaluar			|
						
			
			Y se valida el tipo y estado de la solicitud al rectificar la DAM
			Entonces <respuesta>
			
			Ejemplos: 
				|	tiene_tipo	|	tiene_estado	|	respuesta																																									|
				|	Si					|	Si						|	se obtiene el mensaje de error "DAM cuenta con solicitud de evaluación previa pendiente"	|
				|	Si					|	No						|	no hay mensajes de error																																	|
				|	No					|	Si						|	no hay mensajes de error																																	|
				|	No					|	No						|	no hay mensajes de error																																	|