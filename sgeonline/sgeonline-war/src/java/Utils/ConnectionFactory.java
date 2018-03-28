/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexandre
 */
public class ConnectionFactory {

    private String url = "jdbc:postgresql://localhost:5432/sgeonline";
    private String user = "postgres";
    private String password = "1234";

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Nao foi possível conectar ao banco de dados.");
            System.out.println(e);
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Nao foi possível localizar a classe.");
            System.out.println(ex);
            return null;
        }
    }
}
