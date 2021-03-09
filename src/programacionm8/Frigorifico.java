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
public class Frigorifico extends Electrodomestico {
    private int TempMin;
    private int AguaDep;
    
    public Frigorifico (){}

    public Frigorifico (int TempMin, int AguaDep, String gama, String color,TallaSML Talla, String codigo, String nombre, float precio, int stock){
        super(gama, color, Talla, codigo, nombre, precio, stock);
        this.TempMin = TempMin;
        this.AguaDep = AguaDep;
    }
    public int getTempMin(){
    return TempMin;
    }
    public void setTempMin(){
    this.TempMin = TempMin;
    }
    public int getAguaDep(){
    return AguaDep;
    }
    public void setAguaDep(){
    this.AguaDep = AguaDep;
    }
}
