# language: es
@REQ-02
Característica: Validar la dirección del consignatario de la DAM

Con el fin de validar la información de la DAM de exportación definitiva 
como un operador de comercio exterior 
deseo que el sistema valide la dirección del consignatario de la DAM. 

	Antecedentes:
	
	Dado que país destino de DAM es diferente de Zonas francas del Perú

		Esquema del escenario: Dirección incorrecta del consignatario		
		
		Cuando la DAM tiene dirección de consignatario "<direccion>"
		Y se valida la direccion del consignatario de la DAM
		Entonces se obtiene el mensaje de error "Se debe indicar la dirección del consignatario de la DAM (mínimo 5 caracteres)"
			
			Ejemplos:
			|	direccion	|
			|						| 
			|	abcd			|
			|	abc				|
			|	ab c			|
		
		Esquema del escenario: Dirección correcta del consignatario
		
		Cuando la DAM tiene dirección de consignatario "<direccion>"
		Entonces la dirección del consignatario de la DAM es válida
			
			Ejemplos:
			|	direccion	|
			|	abcde			| 
			|	abc de		|
			|	abc de f	|