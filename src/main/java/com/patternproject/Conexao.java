package com.patternproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
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

    public static void showData(Statement state){
        String sql = "select * from vamotest";
        try{
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                System.out.println("PersonID: "+result.getInt("personid")+
                " Nome: "+result.getString("nome")+" , Idade: "+result.getInt("idade"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
