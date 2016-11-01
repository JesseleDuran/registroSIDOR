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

//Aplica para cualquier trabajador a identificar
public class Trabajador 
{
	public enum TipoNomina
	{
        CONVENIO, CONDUCCION, CONFICENDIAL;
    }

	protected int ci;
	protected String nombre;
	protected String apellido;
	protected String ocupacion;
	protected String centroCosto;
	protected String turno;
	protected String departamento;
	protected TipoNomina tipoNomina;

	public Trabajador()
	{
		ci = 0;
		nombre = null;
		apellido = null;
		ocupacion = null;
		centroCosto = null;
		turno = null;
		departamento = null;
		tipoNomina = null;
	}

	public Trabajador(int ci, String nombre, String apellido, String ocupacion, String centroCosto, String turno, String departamento, TipoNomina tipoNomina)
	{
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ocupacion = ocupacion;
		this.centroCosto = centroCosto;
		this.turno = turno;
		this.departamento = departamento;
		this.tipoNomina = tipoNomina;
	}

	public int getCi()
	{
		return ci;
	}

	public void setCi(int ci)
	{
		this.ci = ci;
	}
    
    public String getNombre()
    {
    	return nombre;
    }

    public void setNombre(String nombre)
    {
    	
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido) 
    {
        this.apellido = apellido;
    }

    public String getOcupacion() 
    {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) 
    {
        this.ocupacion = ocupacion;
    }

    public String getCentroCosto() 
    {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) 
    {
        this.centroCosto = centroCosto;
    }

    public String getTurno() 
    {
        return turno;
    }

    public void setTurno(String turno) 
    {
        this.turno = turno;
    }

    public String getDepartamento() 
    {
        return departamento;
    }

    public void setDepartamento(String departamento) 
    {
        this.departamento = departamento;
    }

    public TipoNomina getTipoNomina() 
    {
        return tipoNomina;
    }

    public void setTipoNomina(TipoNomina tipoNomina) 
    {
        this.tipoNomina = tipoNomina;
    }
    
    
}
