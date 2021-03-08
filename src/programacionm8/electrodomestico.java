/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionm8;

/**
 *
 * @author luigi
 */
public class Electrodomestico extends Articulo{ 
   private String gama;
   private ClaseE clasificacion;
   
   public Electrodomestico(){}
   
   public Electrodomestico(String gama, String color, TallaSML talla, String codigo, String nombre, float precio, int stock){
       super(codigo,nombre,precio,stock);
       this.gama=gama;
       this.clasificacion=clasificacion;
   }
   public String getGama(){
   return gama;
   }
   public void setGama(){
   this.gama=gama;
   }
   public ClaseE getClasificacion(){
   return clasificacion;
   }
   public void setClasificacion(ClaseE clasificacion){
   this.clasificacion=clasificacion;
   }
}
