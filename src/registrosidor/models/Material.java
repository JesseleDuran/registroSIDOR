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
//Clase encargada de los utensilios que se gastan -Prestación-

public class Material
{
    protected String nombre;
    protected String codigoSAP; //aplica como CÓDIGO RENGLÓN en -Prestación- y CÓDIGO ALMACÉN en -Asignación-
    protected String descripcion;
    protected int cantidad;

    public Material()
    {
        nombre = null;
        cantidad = 0;
        codigoSAP = null;
        descripcion = null;
    }
    
    public Material(String nombre, int cantidad, String codigoSAP, String descripcion)
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigoSAP = codigoSAP;
        this.descripcion = descripcion;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public String getCodigoSAP()
    {
        return codigoSAP;
    }

    public void setCodigoSAP(String codigoSAP)
    {
        this.codigoSAP = codigoSAP;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
}
