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
public class StockAndAccountSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new StockAndAccountSystem().getConnect();
        new Login().show();
        
    }
    
    public static Connection getConnect(){
        String connectionURL = "jdbc:derby://localhost:1527/MyTrying";
        //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "tiny", "1234");
            System.out.println("Connect successful ! ");
            return conn; 
            //conn.close();
        } catch (SQLException ex) {
            System.out.println("Connect failed ! ");
        }
        return null;
    }
    
}
