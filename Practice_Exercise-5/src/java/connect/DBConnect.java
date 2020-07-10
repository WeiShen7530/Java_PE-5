/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class DBConnect {
    public static Connection getMySQLConnection() {
        Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(
                "jdbc:mysql://localhost:3308/DANHBA?useUnicode=yes&characterEncoding=UTF-8", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return connect;
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //
    }
}
