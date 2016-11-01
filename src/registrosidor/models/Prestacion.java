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

//Clase encargada para asignar Herramientas (temporalmente) o Materiales (sin devolución)
public class Prestacion extends Asignacion
{
	protected int nOT; //Número de Orden de Trabajo
	protected int cantDespachada;
	protected Trabajador autorizador;
	protected String observaciones;

	public Prestacion(int dia, int anio, int cantidad, Mes mes, Trabajador solicitante, Trabajador depositario, int motivo, Object utensilio, int nOT, int cantDespachada, Trabajador autorizador, String observaciones)
	{
		super(dia, anio, cantidad, mes, solicitante, depositario, motivo, utensilio); //En este caso, el utensilio puede ser Herramienta o Material
		this.nOT = nOT;
		this.cantDespachada = cantDespachada;
		this.autorizador = autorizador;
		this.observaciones = observaciones; 
	}

    public int getnOT() 
    {
        return nOT;
    }

    public void setnOT(int nOT) 
    {
        this.nOT = nOT;
    }

    public int getCantDespachada() 
    {
        return cantDespachada;
    }

    public void setCantDespachada(int cantDespachada) 
    {
        this.cantDespachada = cantDespachada;
    }

    public Trabajador getAutorizador() 
    {
        return autorizador;
    }

    public void setAutorizador(Trabajador autorizador) 
    {
        this.autorizador = autorizador;
    }

    public String getObservaciones() 
    {
        return observaciones;
    }

    public void setObservaciones(String observaciones) 
    {
        this.observaciones = observaciones;
    }

    
}
