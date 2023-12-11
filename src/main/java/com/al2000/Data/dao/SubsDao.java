package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.al2000.Data.data.Subs;

public class SubsDao {
    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public SubsDao(Connection connection) {
        this.connection = connection;
    }

    public void create(int userId, String pseudo, float balance) throws SQLException
    {
        String sql = "INSERT INTO Subscription (userId, pseudo, balance) VALUES (?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userId);
            statement.setString(2, pseudo);
            statement.setFloat(3, balance);
            statement.executeUpdate();
        }
    }
    public Subs read(int userId, int cardId) throws SQLException 
    {
        String sql = "Select * FROM SUBSCRIPTION WHERE userId = ? AND cardId = ?";
        ResultSet resultSet;
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userId);
            statement.setInt(2, cardId);
            resultSet = statement.executeQuery();
        }
        return new Subs(userId, cardId, resultSet.getString(3), resultSet.getFloat(4)); 
    }
    public boolean update(Subs sub) throws SQLException 
    {
        String sql = "UPDATE SUBSCRIPTION SET pseudo = ? AND balance = ? WHERE userId = ? AND cardId = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setString(1, sub.getPseudo());
            statement.setFloat(2, sub.getBalance());
            statement.setInt(3, sub.getUserId());
            statement.setInt(4, sub.getCardId());
            statement.executeUpdate();
            return true;
        }
    }
    public boolean delete(Subs sub) throws SQLException 
    {
        String sql = "DELETE FROM SUBSCRIPTION WHERE userId = ? AND cardId = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, sub.getUserId());
            statement.setInt(2, sub.getCardId());
            statement.executeUpdate();
            return true;
        }
    }
}
