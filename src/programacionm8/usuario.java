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
    //getters y setters
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
    //validar pass
    public boolean segPass(String pass){
        boolean validar = false;
        //pass de por lo menos 8 caracteres
        if(pass.length()>=8){
            //match = true cuando no haya ninguna mayuscula (Queremos al menos 1 Mayuscula)
            if(pass.matches("[^A-Z]+") == false){
                //match = false cuando haya un espacio ,tab, etc. (No queremos espacios)
                if(pass.matches("[\\S]+") == true){
                    //cumple todo --> true
                    validar = true;
                }else{
                }
            }else{
            }
        }else {
        }
          return validar;
           
    }
    //verificar que el correo tenga "@"
    public boolean verEmail(String email){
        boolean validar = false;
        //match = false cuando haya un @
        if(email.matches("[a-zA-Z][^(@)]+") == false){
            validar = true;
        }
        else{
        }
        return validar;
    }
    //Validar nombre para colocar en el correo
    public boolean verNombre(String nombre){
        boolean validar = false;
        //nombre del correo por lo menos de 6 caracteres
        if(nombre.length()>=6){
            email = (nombre+"@correo.es");
            validar = true;
        }
        else {
        }
        return validar;
    }
    
}
