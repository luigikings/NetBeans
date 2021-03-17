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
    private float Precio;
    private int Stock;
    public ArrayList<Opinion> opiniones = new ArrayList();

    public Articulo() {}
    
    public Articulo (String Codigo, String Nombre, float Precio, int Stock){
  this.Codigo = Codigo;
  this.Nombre = Nombre;
  this.Precio = Precio;
  this.Stock = Stock;
    }
    //getters y setters
   public String getCodigo(){
   return Codigo;
   }
   public void setCodigo(String Codigo){
   this.Codigo = Codigo;
   }
   public String getNombre(){
   return Nombre;
   }
   public void setNombre(String Nombre){
   this.Nombre = Nombre;
   }
   public double getPrecio(){
   return Precio;
   }
   public void setPrecio(float Precio){
   this.Precio = Precio;
   }
   public int getStock(){
   return Stock;
   }
   public void setStock(int Stock){
   this.Stock = Stock;
   }
   
   public boolean disponible(int cantidad) {
		return cantidad<=Stock;
	}
   
   public void ajustarStock(int cantidad) {
		this.Stock += cantidad;
	}
   
   //Agregar un comentario a un articulo
   public void addOpinion(Opinion op){
            opiniones.add(op);
        }

    public void setOpiniones(ArrayList<Opinion> opiniones) {
        this.opiniones = opiniones;
    }

    public ArrayList<Opinion> getOpiniones() {
        return opiniones;
    }
     public String showOpinions(){
            StringBuilder sb = new StringBuilder();
            for(Opinion o: opiniones){
                sb.append("\n").append(o);
            }
            return sb.toString();
        }
    
    public float mediapunt (){
        float media = 0;
        for(Opinion op1: opiniones){
            if(op1.getPunt()==puntuacion.horrible){
            media += 1;
            }
            if(op1.getPunt()==puntuacion.malo){
            media += 2;
            }
            if(op1.getPunt()==puntuacion.regular){
            media += 3;
            }
            if(op1.getPunt()==puntuacion.bueno){
            media += 4;
            }
            if(op1.getPunt()==puntuacion.perfecto){
            media += 5;
            }
        }
        
        if (opiniones.size()> 0){
            media = media/opiniones.size();
        }
        return media;
    }
    
    //toString
    @Override
    public String toString() {
        return "Articulo{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Precio=" + Precio + ", Stock=" + Stock + ", opiniones=" + opiniones + '}';
    }
    
    
    
}
