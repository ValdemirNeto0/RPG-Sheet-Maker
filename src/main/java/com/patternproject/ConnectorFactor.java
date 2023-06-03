package com.patternproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectorFactor {
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://localhost:5432/Test1";
    public static final String USER = "postgres";
    public static final String PASS = "123456";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException("Erro!");
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {connection.close();}
        } catch (Exception ex) {
            throw new RuntimeException("Erro!");
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {connection.close();}
            if (statement != null) {statement.close();}
        } catch (Exception ex) {
            throw new RuntimeException("Erro!");
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (connection != null) {connection.close();}
            if (statement != null) {statement.close();}
            if (resultSet != null) {resultSet.close();}
        } catch (Exception ex) {
            throw new RuntimeException("Erro!");
        }
    }
}
