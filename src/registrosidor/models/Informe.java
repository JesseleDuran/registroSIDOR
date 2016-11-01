/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrosidor.models;

/**
 *
 * @author J++
 */

/*Clase que se le debe adjuntar un archivo del informe, el cual debe estar relacionado con la Herramienta 
y Trabajador en cuestión, su uso es en caso de herramienta perdida o deteriorada*/
public class Informe 
{

	public enum Mes
	{
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}

	protected int dia;
	protected int anio;
	protected Mes mes;
	protected Trabajador solicitante;
	protected Herramienta herramienta;
    
}
