# language: es
@REQ-03
Característica: Validar País de destino de la DAM

Con el fin de validar la información de la DAM de exportación definitiva 
como un operador de comercio exterior 
deseo que el sistema valide el país de destino de la DAM.


	Esquema del escenario: El país de destino de la DAM es válido
	
		Cuando la DAM tiene país de destino con código "<codigo_pais>"
		Y se valida el país de destino de la DAM
		Entonces no hay mensajes de error
		
		Ejemplos: 
			
			|	codigo_pais	|
			|	PE					|
			|	HN					|
			|	JP					|
	
	Esquema del escenario: El país de destino de la DAM no es válido
	
		Cuando la DAM tiene país de destino con código "<codigo_pais>"
		Y se valida el país de destino de la DAM
		Entonces se obtiene el mensaje de error "País de destino de la DAM no válido"
		
		Ejemplos: 
			
			|	codigo_pais	|
			|	TA					|
			|	HH					|
			|	UU					|