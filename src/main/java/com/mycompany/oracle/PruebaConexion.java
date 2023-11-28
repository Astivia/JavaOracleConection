/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oracle;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Properties;

/**
 *
 * @author AstiviaMax
 */
public class PruebaConexion {

    public static void main(String[] args) {
//      String url = "jdbc:oracle:thin:@localhost:1522:ORCLMAX21"; --> PARA CONECTARSE DIRECTAMENTE AL LISTENER
        String url = "jdbc:oracle:thin:@//localhost:1522/orclpdb";
        String user= "LIBRERIA";
//      String user = "SYS AS SYSDBA"
        String pass = "123";
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver is loaded Succesfully");
            
//          Configura las propiedades para la conexión SYSDBA
//          Properties properties = new Properties();
//          properties.setProperty("internal_logon", "sysdba");
//          Connection con=DriverManager.getConnection(url,user,pass,properties);
            
            Connection con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection Succesfull with "+con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
