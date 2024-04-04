
package br.ulbra.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "JDBC:mysql://localhost:3306/bdlogin";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection()throws SQLException{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(ClassNotFoundException | SQLException ex ){
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
            return null;
        }
            
        }
    
}
