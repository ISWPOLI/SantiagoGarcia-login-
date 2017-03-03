/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;


/**
 *
 * @author santi
 */

public class Conexion {
    
   private String username = "root";
   private String password = "root";
   private String host = "localhost";
   private String puerto = "3306";
   private String database = "prueba";
   private String classname = "com.mysql.jdbc.Driver";
   private String url = "jdbc:mysql://"+host+":"+puerto+"/"+database;
   private Connection con;
   
   public Conexion(){
       try {
           Class.forName(classname);
           con = DriverManager.getConnection(url,username,password);
       } 
       //para que imprima los errores y saber que pasa 
       catch (ClassNotFoundException e) {
           
           System.out.print(e);                
       }
       catch (SQLException e) {
           System.out.print(e);                
       }       
   }
   //aca a probar si funciona
   
   public Connection getConexion(){
       return con;
   }
   
}
   
    
    

