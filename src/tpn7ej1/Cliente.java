/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn7ej1;

/**
 *
 * @author yo125
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String dni;

    public Cliente(String nombre, String apellido, String ciudad, String direccion, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String toString(){
    
    return this.nombre + " / " + this.apellido + " / " + this.ciudad + " / " + this.direccion + " / " + this.dni + " / " + this.telefono;
    
        
    
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
    
}
