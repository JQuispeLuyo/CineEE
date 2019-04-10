/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Conexion {

    public static Connection cnx = null;

    public static Connection conectar() throws Exception {
        InputStream inputStream
                = Conexion.class.getClassLoader().
                        getResourceAsStream("properties/db.properties");
        Properties properties = new Properties();

        try {

            properties.load(inputStream);
            String user = properties.getProperty("user");
            String pwd = properties.getProperty("pwd");
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Entro :D");
           
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "ya fue pe");
            System.out.println("Error conexion");
            
        }

        return cnx;
    }

    public static void cerrar() throws Exception{
        if(cnx != null){
            cnx.close();
        }
    }
    
    public static void main(String[] args) throws Exception {

    }
    
}
