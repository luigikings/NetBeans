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

    public Frigorifico (int TempMin, int AguaDep, String gama, ClaseE clasificacion, String codigo, String nombre, float precio, int stock){
        super(gama, clasificacion ,codigo ,nombre, precio, stock);
        this.TempMin = TempMin;
        this.AguaDep = AguaDep;
    }
        //getters y setters
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

    @Override
    public String toString() {
        return "Frigorifico{" + "TempMin=" + TempMin + ", AguaDep=" + AguaDep + '}';
    }
    
}
