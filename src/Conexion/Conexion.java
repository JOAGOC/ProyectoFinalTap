package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String USER = "root";
    private static final String PASSWORD = "12345678";
    private static final String NAME_SCHEMA = "d'porte";
    public static Connection cnn = null;
    public static Statement st = null;

    public static void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + NAME_SCHEMA, USER, PASSWORD);
            st = cnn.createStatement();
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver;" + ex.getMessage());
        }
    }

    public Connection getCnn() {
        return cnn;
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }
    
    public static void main(String[] args) {
        conectar();
    }
}