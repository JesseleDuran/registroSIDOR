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

//Clase encargada para asignar Herramientas únicamente, de manera permanente
public class Asignacion 
{
	public enum Mes
	{
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}

	public static final int NDEPOSITO = 1;
	public static final String ZONA_ALMACENAJE = "NA";
	protected static int nSolicitud; //contador continuo para todos los objetos, contando -Prestacion-
	protected int dia;
	protected int anio;
	protected int cantidad; //cantidad solicitada 
	protected Mes mes;
	protected Trabajador solicitante; //El que recibe la Herramienta
	protected Trabajador depositario; //El que entrega la Herramienta
	protected int motivo; //parte de una leyenda
	protected Object utensilio;

	public Asignacion(int dia, int anio, int cantidad, Mes mes, Trabajador solicitante, Trabajador depositario, int motivo, Object utensilio)
	{
		this.dia = dia;
		this.anio = anio;
		this.cantidad = cantidad;
		this.mes = mes;
		this.solicitante = solicitante;
		this.depositario = depositario;
		this.motivo = motivo;
		this.utensilio = utensilio; //En esta clase, este valor siempre será de -Herramienta-
		
		nSolicitud++; /*Al imprimirse o guardarse, en el caso de -Asignacion- será: nSolicitud + "A"; En el caso de -Prestacion- será: nSolicitud + "P"*/
	} 


    public int getDia() 
    {
        return dia;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getAnio() 
    {
        return anio;
    }

    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }

    public Mes getMes() 
    {
        return mes;
    }

    public void setMes(Mes mes) 
    {
        this.mes = mes;
    }

    public Trabajador getSolicitante() 
    {
        return solicitante;
    }

    public void setSolicitante(Trabajador solicitante) 
    {
        this.solicitante = solicitante;
    }

    public Trabajador getDepositario() 
    {
        return depositario;
    }

    public void setDepositario(Trabajador depositario) 
    {
        this.depositario = depositario;
    }

    public int getMotivo() 
    {
        return motivo;
    }

    public void setMotivo(int motivo) 
    {
        this.motivo = motivo;
    }

    public Object getUtensilio() 
    {
        return utensilio;
    }

    public void setUtensilio(Object utensilio) 
    {
        this.utensilio = utensilio;
    }


    
}
