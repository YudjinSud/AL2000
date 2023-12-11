package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.data.UserAdmin;

public class UserAdminDao {
    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public UserAdminDao(Connection connection) {
        this.connection = connection;
    }

    public void create(UserAdmin userAdmin) throws SQLException
    {
        String sql = "INSERT INTO Subscription (userId, cardId) VALUES (?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userAdmin.getUserId());
            statement.setInt(2, userAdmin.getCardId());
            statement.executeUpdate();
        }
    }
    public ArrayList<UserAdmin> read(int userId) throws SQLException 
    {
        String sql = "Select * FROM USERADMIN WHERE userId = ?";
        ResultSet resultSet;
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userId);
            resultSet = statement.executeQuery();
        }
        ArrayList<UserAdmin> userAdmins = new ArrayList<UserAdmin>();
        while (resultSet.next()) 
        {
            userAdmins.add(new UserAdmin(userId, resultSet.getInt(2))); 
        }
        return userAdmins;
    }
    public boolean update() throws SQLException {return false;}
    public boolean delete(UserAdmin userAdmin) throws SQLException 
    {
        String sql = "DELETE FROM USERADMIN WHERE userId = ? AND cardId = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userAdmin.getUserId());
            statement.setInt(2, userAdmin.getCardId());
            statement.executeUpdate();
            return true;
        }
    }
}
