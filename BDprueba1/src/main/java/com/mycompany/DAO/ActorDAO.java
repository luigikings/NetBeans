/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAO;

import com.mycompany.models.Actor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luigi
 */
public class ActorDAO {
    private Connection conexion;
    
    String host = "";
    String port = "";       
    String dbname = "";
    String username = ""; 
    String password = "";
    public void conectar() throws ClassNotFoundException, SQLException, IOException{
        conexion = DriverManager.getConnection("jdbc:mariadb://") + host + ":" + port + "/" + name + "?serverTimezone=UTC",username, password);
    }
    public void desconectar() throws SQLException {
        conexion.close();
    }
    
    public List<Actor> listActores() throwa SQLException {
        List<Actor> actores = new ArrayList<>();
        String sql = "SELECT nombre, nacionalidad,sexo FROM actor";
        
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Actor a = new Actor();
            a.setNombre(resultado.getString(1));
            a.setNacionalidad(resultado.getString(2));
            a.setSexo(resultado.getString(3).charAT(0));
            actores.add(a);
        }
        return actores;
    }
    
    
    
}
