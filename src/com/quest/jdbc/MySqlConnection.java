package com.quest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/quest_schema";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="password@123";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        
    }
}
