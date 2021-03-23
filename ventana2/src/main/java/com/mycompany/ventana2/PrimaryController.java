package com.mycompany.ventana2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML   
    private Label resultado;
    @FXML   
    private Label resultado1;
    
    @FXML
    private TextField user;
    
    @FXML
    private TextField pass;
    
     @FXML
    private TextField email;
    
    @FXML
    private void switchToSecondary() throws IOException {
        String usuario = user.getText();
        String pass1 = pass.getText();
        String email1 = email.getText();
        usuario u = new usuario();
        
        boolean oknombre = u.verNombre(usuario);
        if (oknombre){
            boolean okpass = u.segPass(pass1);
            if(okpass){
                boolean okemail = u.verEmail(email1);
                if (okemail){
                    resultado.setText("");
                    u.setNombre(usuario);
                    u.setPass(pass1);
                    u.setEmail(email1);
                    resultado1.setText("BIENVENIDO"+ u.toString());
                    
                }else{
                    resultado.setText("Error en el inicio CORREO INVALIDO "+ usuario);
                }
            }else{
            resultado.setText("Error en el inicio CONTRASEÑA INVALIDA "+ usuario);
            }
        }else{
            resultado.setText("Error en inicio USUARIO INVALIDO "+ usuario);
        }    
    }
}

