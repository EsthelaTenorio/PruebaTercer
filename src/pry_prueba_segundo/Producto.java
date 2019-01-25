/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba_segundo;

/**
 *
 * @author DELL
 */
public class Producto {
   private int codigo;
   private String nombre;
    private String tipo;
    private int precio;

    public Producto(int codigo, String nombre, String tipo, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Producto" + "codigo=" + codigo + ", nombre" +nombre + ", precio" + precio + '}';
    }
}
