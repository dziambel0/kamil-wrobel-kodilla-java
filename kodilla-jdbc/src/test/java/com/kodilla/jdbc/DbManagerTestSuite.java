package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {
    @Test
    void testConnection() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuary = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuary);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " + rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(15, counter);
    }
    @Test
    void testSelectUsersAndTask() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuary = """
        SELECT U.FIRSTNAME, U.LASTNAME, I.SUMMARY
        FROM USERS U
        JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO
        """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuary);
        //Then
        int counter = 0;
        while (resultSet.next()){
            System.out.println(resultSet.getString("FIRSTNAME")+", "+resultSet.getString("LASTNAME")+", "+resultSet.getString("SUMMARY"));
            counter++;
        }
        resultSet.close();
        statement.close();
        assertEquals(15, counter);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuary = """
                SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER
                FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID
                GROUP BY P.USER_ID
                HAVING COUNT(*) > 1
                ORDER BY U.LASTNAME, U.FIRSTNAME
                """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuary);
        //Then
        int counter = 0;
        while (resultSet.next()){
            System.out.println(resultSet.getString("FIRSTNAME")+", "+resultSet.getString("LASTNAME"));
            counter++;
        }
        statement.close();
        resultSet.close();
        assertEquals(2, counter);
    }
}


