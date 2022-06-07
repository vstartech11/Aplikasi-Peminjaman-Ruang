/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.sql.*;
public class Model {
    private String username;
    public Model(String username){
        this.username = username;
        ConnectDataBase tes = new ConnectDataBase("jdbc:mysql://localhost:3306/crud", "root", "", "com.mysql.cj.jdbc.Driver");
        Statement stmt = tes.getConnection().createStatement();
    }

    ResultSet getdata = stmt.executeQuery("select * from tb_crud");
}
