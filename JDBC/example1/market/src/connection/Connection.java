package connection;

import java.sql.*;

public class Connection {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/Market";
        String usuario = "jfelipefg17";
        String contraseña = "1001445250Fg.";

        try {
            // Establecer la conexión a la base de datos
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, usuario, contraseña);

//            String sql = "SELECT NAME FROM PRODUCTOS  WHERE NAME = 18";
//            Statement stmt = connection.createStatement();
//            ResultSet result = stmt.executeQuery(sql);
//            if (result.next()) {
//                String name = result.getString("NAME");
//                System.out.print(name);
//            } else {
//                System.out.println("No se encontraron resultados para id_student = 1");
//            }

            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí puedes ejecutar consultas SQL y otras operaciones con la base de datos.
                //connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}

