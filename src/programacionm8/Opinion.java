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
public class Opinion {
    private usuario user;
    private puntuacion punt;
    private String coment;
    private int votopos = 0;
    private int votoneg = 0;
    
    public Opinion(){} 
    
    public Opinion(usuario user, puntuacion punt, String coment){
        this.user = user;
        this.coment = coment;
        this.punt = punt;
        
        
    }
    //getters y setters
    public usuario getUser() {
        return user;
    }

    public puntuacion getPunt() {
        return punt;
    }

    public String getComent() {
        return coment;
    }

    public void setUser(usuario user) {
        this.user = user;
    }

    public void setPunt(puntuacion punt) {
        this.punt = punt;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }
    //+1 voto positivo
    public void votoPositivo(){
        votopos++;
    }
    //+1 voto negativo
    public void votoNegativo(){
        votoneg++;
    }

    @Override
    public String toString() {
        return "Opinion{" + "user=" + user + ", punt=" + punt + ", coment=" + coment + ", votopos=" + votopos + ", votoneg=" + votoneg + '}';
    }
    
}
