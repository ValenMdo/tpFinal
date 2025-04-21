/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author valen
 */
public class Conexion {
    
    private static final String URL = "link db";
    private static final String USUARIO = "";
    private static final String PASSWORD = "";
    
    public Connection getConnection(){
        
        Connection con = null;
        
        try{
            con = DriverManager.getConnection(URL,USUARIO,PASSWORD);
            System.out.println("conexion exitosa");
        }catch(SQLException e){
            System.out.println("error en la conexion");
            e.printStackTrace();
        }
        
        return con;
        
    }
    
}
