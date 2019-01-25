/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba_segundo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class Base_Producto {
    //ARRAYList de TIPO OBJETO
  private  ArrayList<Producto> listaProducto=new ArrayList<Producto>();
  //hacer una insercion o añadir 
                                 //clas //objeto
  public void insertarEmpleado(Producto producto){
      listaProducto.add(producto);
  }
  //metodo para recorrer arraylist con el iterator
  public void imprimirEmpleado(){
      Iterator miIterator=listaProducto.iterator();//descompone la lista empleados para pasar uno a uno 
      while(miIterator.hasNext()){
         Producto producto= (Producto)miIterator.next();
          System.out.println(producto.toString());
      }
  }
  //metodo para eliminar
  public void eliminirEmpleado(Producto pro){
      listaProducto.remove(pro);
  }
  //metodo para buscar
  /*public void buscarEmpleado(String cedula){
      boolean op=false;
      Iterator miIterator=listaProducto.iterator();//descompone la lista empleados para pasar uno a uno 
      while(miIterator.hasNext()){
         Producto producto= (Producto)miIterator.next();
         if(producto.getCodigo().equals(codigo)){
             System.out.println("1.NOMBRE:"+elemento.getNombre());
             System.out.println("2.CEDULA:"+elemento.getCedula());
             System.out.println("3.DIRECCION:"+elemento.getDir());
             op=true;
            }
            }
            if(op==false){
            System.out.println("NO SE ENCONTRO  EMPLEADO A BUSCAR");
            }
        }*/
}
