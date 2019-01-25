
package pry_prueba_segundo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pry_Prueba_Segundo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ArrayList<String> productos=new ArrayList<>();
        String producto;
        int p,opciones;
        System.out.println("\t PROGRAMA CON MENU DE PRODUCTOS");
        System.out.println("1.AÑADIR");
        System.out.println("2.ELIMINAR");
        System.out.println("3.BUSCAR");
        System.out.println("4.MODIFICAR");
        
        System.out.println("\t ELIJA LA OPCION PORFAVOR");
        opciones=teclado.nextInt();
        
        System.out.print("INGRESE EL NUMERO DE PRODUCTOS QUE DESEA?:");
        p=teclado.nextInt();
         //Metodo ADD añade un elemento del array list
        System.out.println("\t METODO ADD");
        for(int i=0;i<=p;i++){
            System.out.print("INGRESE EL PRODUCTO:");
            producto=teclado.next();
            productos.add(producto); 
        }
        System.out.println("LOS PRODUCTOS INGRESADOS SON:"+productos);
        //Metodo REMOVE elimina elementos que muestra la lista 
         System.out.println("\t METODO REMOVE");
         productos.remove(3);
         System.out.println(productos.toString());
         //Metodo ITERATOR sirve para recorrer un array list
         System.out.println("\t METODO ITERATOR");
        Iterator<String>it=productos.iterator();
        while(it.hasNext()){
         producto=it.next();
         //next-- devuelve el siguiente elemento de la interaccion
          System.out.println("YA SE ENCONTRO EL PRODCUTO DESEADO:"+producto);
        }
       
    }
    
}
