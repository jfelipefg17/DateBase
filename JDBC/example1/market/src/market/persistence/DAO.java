package market.persistence;

import java.sql.*;

public abstract class DAO {

    protected Connection connection = null;
    protected ResultSet result = null;
    protected Statement sentence = null;

    private final String JDBCURL = "jdbc:mysql://localhost:3306/Market";
    private final String USER = "jfelipefg17";
    private final String PASSWORD = "1001445250Fg.";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void connectDB () throws SQLException, ClassNotFoundException {

    try {
        // Establecer la conexión a la base de dato
        Class.forName(DRIVER);
        java.sql.Connection connection = DriverManager.getConnection(JDBCURL, USER, PASSWORD);

        if (connection != null) {
            //System.out.println("Successful connection to the database.");
            // Aquí puedes ejecutar consultas SQL y otras operaciones con la base de datos.//connection.close();
        }

        }catch (ClassNotFoundException | SQLException e) {
            throw e;
            //System.out.println("Error when connecting to the database: " + e.getMessage());
        }

    }

    protected void disconnectDB () throws SQLException {

        try {
            if (result != null) {
                result.close();
            }
            if (sentence != null) {
                sentence.close();
            }
            if (connection != null) {
                connection.close();
            }
            System.out.println("Successful disconnection to the database.");
        }catch (Exception e) {
            throw e;
            //System.out.println("Error when disconnecting to the database:" + e.getMessage());
        }

    }


    protected void cudDB (String sql) throws SQLException, ClassNotFoundException {
        try {
            connectDB();
            sentence = connection.createStatement();
            sentence.executeUpdate(sql);

        }catch (ClassNotFoundException | SQLException e) {
            throw e;
            //System.out.println("Error CUD sql query");
        }finally {
            disconnectDB();
        }
    }

    public void rDB (String sql ) throws SQLException, ClassNotFoundException {
        try {
            connectDB();
            sentence = connection.createStatement();
            result = sentence.executeQuery(sql);
        }catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }




}

