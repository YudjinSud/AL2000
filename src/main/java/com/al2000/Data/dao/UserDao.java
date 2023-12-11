package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.al2000.Data.data.User;

public class UserDao {

    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public void create(int creditCardId) throws SQLException 
    {
        String sql = "INSERT INTO USER (creditCardId) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, creditCardId);
            statement.executeUpdate();
        }
    }
    public User read(int userId) throws SQLException 
    {
        String sql = "Select * FROM USER WHERE userId = ?";
        ResultSet resultSet;
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userId);
            resultSet = statement.executeQuery();
        }
        return new User(resultSet.getInt(1), resultSet.getInt(2));
    }
    public boolean update(User user) throws SQLException 
    {
        String sql = "UPDATE USER SET creditCardId = ? WHERE userId = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, user.getCreditCardId());
            statement.setInt(2, user.getUserId());
            statement.executeUpdate();
            return true;
        }
    }
    public boolean delete(User user) throws SQLException 
    {
        String sql = "DELETE FROM USER WHERE userId = ? AND creditCardId = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, user.getUserId());
            statement.setInt(2, user.getCreditCardId());
            statement.executeUpdate();
            return true;
        }
    }
}
