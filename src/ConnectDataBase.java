/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.sql.*;
public class ConnectDataBase {
    public static void main(String[] args) {
        
        String connectionUrl = "";
        String hostname = "localhost";
        String sqlInstanceName = "";
        String sqlUSer ="";
        String sqlPassword ="";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            //TODO: handle exception
            
        }
            
    }
    

}
