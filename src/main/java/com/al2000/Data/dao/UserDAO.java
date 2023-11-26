package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.al2000.Data.data.User;


public class UserDao {

    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public UserDao(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour insérer un utilisateur dans la base de données
    public void create() throws SQLException {
        String sql = "INSERT INTO Users (creditCardId) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, 1234);
            statement.executeUpdate();
        }
    }
}
