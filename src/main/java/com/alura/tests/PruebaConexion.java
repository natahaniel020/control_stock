package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Controlador de MySQL cargado correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador de MySQL: " + e.getMessage());
        }
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZome=UTC", "root", "Camilo2023*");

        con.close();
    }

}
