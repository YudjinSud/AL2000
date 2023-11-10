package com.al2000.data.tool;

import java.sql.Connection;
import java.sql.DriverManager;

import java.lang.*;


public class DatabaseConnection {
    private static final String URL_Runtime = System.getenv().getOrDefault("URL_Runtime", "");
    private static final String USER_Runtime = System.getenv().getOrDefault("USER_Runtime", "");
    private static final String PASSWORD_Runtime = System.getenv().getOrDefault("PASSWORD_Runtime", "");

    public static Connection getConnection(boolean mode) throws Exception {
        if (mode)
            return DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
        else if (!URL_Runtime.isEmpty() && !USER_Runtime.isEmpty() && !PASSWORD_Runtime.isEmpty()) {
            return DriverManager.getConnection(URL_Runtime, USER_Runtime, PASSWORD_Runtime);
        } else {
            throw new Exception("Database connection .env variables is not presented");
        }
    }
}