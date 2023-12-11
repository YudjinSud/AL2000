package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.data.RestrictedCat;

public class RestrictedCatDao {
    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public RestrictedCatDao(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour insérer un utilisateur dans la base de données
    public void create(RestrictedCat restrictedCat) throws SQLException 
    {
        String sql = "INSERT INTO RestrictedCat (userId, cardId, movieType) VALUES (?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, restrictedCat.getUserId());
            statement.setInt(2, restrictedCat.getCardId());
            statement.setString(3, restrictedCat.getCategory());
            statement.executeUpdate();
        }
    }

    public ArrayList<RestrictedCat> read(int userId, int cardId) throws SQLException 
    {
        String sql = "Select * FROM RESTRICTEDCAT WHERE userId = ? AND cardId = ?";
        ResultSet resultSet;
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userId);
            statement.setInt(2, cardId);
            resultSet = statement.executeQuery();
        }

        ArrayList<RestrictedCat> restrictedCat = new ArrayList<RestrictedCat>();
        while (resultSet.next()) 
        {
            restrictedCat.add(new RestrictedCat(userId, cardId, resultSet.getString(3))); 
        }
        return restrictedCat; 
    }

    public boolean update(RestrictedCat restrictedCat) throws SQLException { return false; }

    public boolean delete(RestrictedCat restrictedCat) throws SQLException {         
        String sql = "DELETE FROM RestrictedCat WHERE userId= ? AND cardId = ? AND movieType = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, restrictedCat.getUserId());
            statement.setInt(2, restrictedCat.getCardId());
            statement.setString(3, restrictedCat.getCategory());
            statement.executeUpdate();
            return true;
        } 
    }
}
