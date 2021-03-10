/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionm8;

import java.util.ArrayList;

/**
 *
 * @author luigi
 */
public class Articulo {
    private String Codigo;
    private String Nombre;
    private double Precio;
    private int Stock;
    public ArrayList<Opinion> opiniones = new ArrayList();

    public Articulo() {}
    
    public Articulo (String Codigo, String Nombre, double Precio, int Stock){
  this.Codigo = Codigo;
  this.Nombre = Nombre;
  this.Precio = Precio;
  this.Stock = Stock;
    }
    //getters y setters
   public String getCodigo(){
   return Codigo;
   }
   public void setCodigo(){
   this.Codigo = Codigo;
   }
   public String getNombre(){
   return Nombre;
   }
   public void setNombre(){
   this.Nombre = Nombre;
   }
   public double getPrecio(){
   return Precio;
   }
   public void setPrecio(){
   this.Precio = Precio;
   }
   public int getStock(){
   return Stock;
   }
   public void setStock(){
   this.Stock = Stock;
   }

    public void setOpiniones(ArrayList<Opinion> opiniones) {
        this.opiniones = opiniones;
    }

    public ArrayList<Opinion> getOpiniones() {
        return opiniones;
    }
    public void agregarComentario(Opinion op1){
        for (int i = 0; i < opiniones.size(); i++) {
            if (opiniones.get(i) == null) {
                opiniones.add(op1);
             
            }
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "Articulo{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Precio=" + Precio + ", Stock=" + Stock + ", opiniones=" + opiniones + '}';
    }
    
    
    
}
