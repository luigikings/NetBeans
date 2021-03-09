/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionm8;

import static java.time.Clock.system;

/**
 *
 * @author luigi
 */
public class usuario {
    private String nombre;
    private String pass;
    private String email;
    
     public usuario() {}

    public usuario(String nombre, String pass, String email) {
        this.nombre = nombre;
        this.pass = pass;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public boolean segPass(){
        if(pass.length()>=8){
            if(){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
          
           
    }
    public boolean verEmail(){
        if(email.contains("@")){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean verNombre(){
        if(nombre.length()>=6){
            email = (nombre+"@correo.es");
            return true;
        }
        else {
            return false;
        }
    }
    
}
