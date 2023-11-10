package com.al2000.Data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.al2000.Data.data.Utilisateur;

import javax.xml.transform.Result;


public class UtilisateurDao {

    private Connection connection; // L'objet de connexion à la base de données

    // Constructeur pour injecter la connexion
    public UtilisateurDao(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour insérer un utilisateur dans la base de données
    public void create(Utilisateur utilisateur) throws SQLException {

        try {
            Utilisateur user = this.getById(utilisateur.getId());
            if (!user.getNom().isEmpty()) {
                return;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sql = "INSERT INTO utilisateur (id, nom, prenom) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, utilisateur.getId());
            statement.setString(2, utilisateur.getNom());
            statement.setString(3, utilisateur.getPrenom());
            statement.executeUpdate();
        }
    }

    // Méthode pour récupérer un utilisateur par son ID
    public Utilisateur getById(int id) throws SQLException {
        String sql = "SELECT id, nom, prenom FROM utilisateur WHERE id = (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (!rs.next()) {
                throw new SQLException("No such user with id=" + id + "found");
            }

            int fetchedId = rs.getInt(1);
            String fetchedNom = rs.getString(2);
            String fetchedPreNom = rs.getString(3);

            return new Utilisateur(fetchedId, fetchedNom, fetchedPreNom);
        }
    }

    // Méthode pour récupérer tous les utilisateurs de la base de données
    public List<Utilisateur> getAll() throws SQLException {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        // A complérer
        return utilisateurs;
    }

    // Méthode pour mettre à jour un utilisateur
    public void update(Utilisateur utilisateur) throws SQLException {
        // A complérer
    }

    // Méthode pour supprimer un utilisateur par son ID
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM utilisateur WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
