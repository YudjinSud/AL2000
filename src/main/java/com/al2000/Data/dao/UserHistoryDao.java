package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.data.UserHistory;

public class UserHistoryDao {
        private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public UserHistoryDao(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour insérer un utilisateur dans la base de données
    public void create(UserHistory userHistory) throws SQLException {
        String sql = "INSERT INTO USERHISTORY (userId, cardId, movieId, dateWatched, isPhysical) VALUES (?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, userHistory.getUserId());
            statement.setInt(2, userHistory.getCardId());
            statement.setInt(3, userHistory.getMovieId());
            statement.setDate(4, userHistory.getDateWatched());
            statement.setBoolean(5, userHistory.isPhysical());
            statement.executeUpdate();
        }
    }

    public ArrayList<UserHistory> read(int userId, int cardId) throws SQLException
    {
        String sql = "Select * FROM USERHISTORY WHERE userId = ? AND cardId = ?";
        ResultSet resultSet;
        try (PreparedStatement statement = connection.prepareStatement(sql)) 
        {
            statement.setInt(1, userId);
            statement.setInt(2, cardId);
            resultSet = statement.executeQuery();
        }
        ArrayList<UserHistory> userHistories = new ArrayList<UserHistory>();
        while (resultSet.next()) 
        {
            userHistories.add(new UserHistory(resultSet.getInt(3), resultSet.getDate(4), resultSet.getBoolean(5), userId, cardId)); 
        }
        return userHistories;
    }

    public boolean update(UserHistory userHistory) throws SQLException { return false; }

    public boolean delete(UserHistory userHistory) throws SQLException { return false; }
}
