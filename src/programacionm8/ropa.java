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
public class ropa extends Articulo {
    private String Color;
    private TallaSML Talla;

    public ropa(){}
    
    public ropa(String Color, TallaSML Talla, String codigo, String nombre, float precio, int stock){
        super(codigo,nombre,precio,stock);
        this.Talla = Talla;
        this.Color = Color;
    }
    
   public String getColor(){
    return Color;
   }
   public void setColor(){
    this.Color = Color;
   }
   public TallaSML getTallaSML(){
    return Talla;
   }
   public void setTallaSML(){
    this.Talla = Talla;
   }
    

}
