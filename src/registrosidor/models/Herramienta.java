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
//Clase encargada de los utensilios para -Asignación- y para -Préstamo-

public class Herramienta extends Material
{
    protected String serie;
    protected String marca;
    protected String modelo;

    public Herramienta()
    {
    	super();
    	serie = null;
    	marca = null;
    	modelo = null;
    }

    public Herramienta(String nombre, int cantidad, String codigoSAP, String descripcion, String serie, String marca, String modelo)
    {
    	super(nombre, cantidad, codigoSAP, descripcion);
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getSerie()
    {
    	return serie;
    }

    public void setSerie(String serie)
    {
    	this.serie = serie;
    }

    public String getMarca()
    {
    	return marca;
    }

    public void setMarca(String marca)
    {
    	this.marca = marca;
    }

    public String getModelo()
    {
    	return modelo;
    }

    public void setModelo(String modelo)
    {
    	this.modelo = modelo;
    }   
    
}
