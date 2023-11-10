package com.al2000.data.tool;

import java.sql.Connection;
import java.sql.SQLException;

public class Session {

    private Connection connection;
    private boolean mode;

    public Session(boolean mode) {  
        this.mode =  mode;
    }

    public void open() throws SQLException {
        if (connection==null) {
            try {
                connection = DatabaseConnection.getConnection(mode);
                connection.setAutoCommit(false); // Désactivez l'autocommit pour gérer manuellement la transaction
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(2);
            }
        }
    }

    public void commit() throws SQLException {
        connection.commit();
        connection.setAutoCommit(true); // Réactivez l'autocommit
    }

    public void rollback() throws SQLException {
        connection.rollback();
        connection.setAutoCommit(true); // Réactivez l'autocommit
    }

    public void close() throws SQLException {
        if (connection!=null) {
            connection.close(); // Désactivez l'autocommit pour gérer manuellement la transaction
            connection=null;
        }
    }

    public Connection get() {
        return connection;
    }
}
