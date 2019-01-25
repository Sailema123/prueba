/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro_Sailema
 */
public class codigo {
       String nombre;
	float codigo;
	float  precio;
        float tipo;

    public codigo(String nombre, float codigo, float precio, float tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public float getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipo(float tipo) {
        this.tipo = tipo;
    }
        
    }
	
