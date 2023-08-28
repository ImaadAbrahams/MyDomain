/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.mycput.jdbcuniapp.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author imaad
 */
public class DBConnection {
    public static Connection getConnection() throws SQLException{
        String URL = "jdbc:derby://localhost:1527/ApplicationDB";
        String user = "administrator";
        String pword = "password";
        
        Connection conn = DriverManager.getConnection(URL, user, pword);
        return conn;
    }
}
