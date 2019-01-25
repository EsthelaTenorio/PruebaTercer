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
public class Tipo_Producto {
   private String lacteo;
    private String cereal;
   private  String verduras;
    public Tipo_Producto(String lacteo, String cereal, String verduras) {
        this.lacteo = lacteo;
        this.cereal = cereal;
        this.verduras = verduras;
    }

    public String getLacteo() {
        return lacteo;
    }

    public void setLacteo(String lacteo) {
        this.lacteo = lacteo;
    }

    public String getCereal() {
        return cereal;
    }

    public void setCereal(String cereal) {
        this.cereal = cereal;
    }

    public String getVerduras() {
        return verduras;
    }

    public void setVerduras(String verduras) {
        this.verduras = verduras;
    }  
     @Override
    public String toString() {
        return "Tipo_Producto{" + "lacteo=" + lacteo + ", cereal=" + cereal+ ", verduaras" + verduras + '}';
    }
    
}
