/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PS
 */
public class StockSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new StockSystem().getConnect();
        new Stock().show();
        
    }
    
    public static Connection getConnect(){
        String connectionURL = "jdbc:derby://localhost:1527/StockSystem";
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "app", "123");
            return conn; 
            //conn.close();
        } catch (SQLException ex) {
            System.out.println("Connect failed ! ");
        }
        return null;
    }
    
}
