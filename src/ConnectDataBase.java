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
    private Connection connect;
    private String url;
    private String username;
    private String password;
    private String driverName;
    public ConnectDataBase(String url,String username,String password,String driverName){
        this.url = url;
        this.username = username;
        this.password = password;
        this.driverName = driverName;
    
    }
    public  Connection getConnection(){
        try{
            connect = DriverManager.getConnection(url,username,password);
            Class.forName(driverName);
            System.out.println("connection is established");
        }
        catch(Exception e){
            e.printStackTrace();}
        return connect;
    }

    
    public static void main(String[] args) {
        ConnectDataBase tes = new ConnectDataBase("jdbc:mysql://localhost:3306/crud", "root", "", "com.mysql.cj.jdbc.Driver");

    }

}
