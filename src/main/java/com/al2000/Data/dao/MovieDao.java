package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.data.Movie;

public class MovieDao {
    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public MovieDao(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour insérer un utilisateur dans la base de données
    public void create() throws SQLException { }

    public Movie read(int movieId) throws SQLException 
    {
        String sql1 = "Select * FROM Movie WHERE movieId = ?";
        ResultSet resultSet1;
        try (PreparedStatement statement1 = connection.prepareStatement(sql1)) 
        {
            statement1.setInt(1, movieId);
            resultSet1 = statement1.executeQuery();
        }

        ArrayList<String> movieCat = new ArrayList<String>();
        String sql2 = "Select * FROM Movie M JOIN MovieCat C USING movieId WHERE movieId = ?";
        ResultSet resultSet2;
        try (PreparedStatement statement2 = connection.prepareStatement(sql2)) 
        {
            statement2.setInt(1, movieId);
            resultSet2 = statement2.executeQuery();
        }
        while (resultSet2.next()) 
        {
            movieCat.add(resultSet2.getString(2)); 
        }

        ArrayList<String> actors = new ArrayList<String>();
        String sql3 = "Select * FROM Movie M JOIN Actors A USING movieId JOIN Person USING movieId WHERE movieId = ?";
        ResultSet resultSet3;
        try (PreparedStatement statement3 = connection.prepareStatement(sql3)) 
        {
            statement3.setInt(1, movieId);
            resultSet3 = statement3.executeQuery();
        }
        while (resultSet3.next()) 
        {
            actors.add(resultSet3.getString(5)+" "+resultSet3.getString(6)); 
        }

        ArrayList<String> directors = new ArrayList<String>();
        String sql4 = "Select * FROM Movie M JOIN Director D USING movieId JOIN Person USING movieId WHERE movieId = ?";
        ResultSet resultSet4;
        try (PreparedStatement statement4 = connection.prepareStatement(sql4)) 
        {
            statement4.setInt(1, movieId);
            resultSet4 = statement4.executeQuery();
        }
        while (resultSet4.next()) 
        {
            directors.add(resultSet3.getString(5)+" "+resultSet3.getString(6)); 
        }
        return new Movie(resultSet1.getInt(1), resultSet1.getString(2), resultSet1.getBoolean(5), movieCat, actors, directors); 
    }

    public boolean update(Movie user) { return false; }

    public boolean delete(Movie user) { return false; }
}
