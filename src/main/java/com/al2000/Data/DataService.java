package com.al2000.Data;

import com.al2000.Data.data.Utilisateur;
import com.al2000.Data.service.UtilisateurService;
import com.al2000.Data.tool.Session;

import java.sql.SQLException;

// TODO (NewYards) refactor!!!
public class DataService {

    public static void main(String[] args) throws SQLException {
        // Créez une connexion à votre base de données (par exemple, MySQL)
    }

    public Utilisateur getUser() throws SQLException {
        Session session = new Session(false);

        try {

            // Créez un gestionnaire de transactions

            // Créez un service avec le DAO et le gestionnaire de transactions
            UtilisateurService utilisateurService = new UtilisateurService(session);

            // Exemple d'utilisation du service
            Utilisateur nouvelUtilisateur = new Utilisateur(1, "John", "Doe");
            utilisateurService.createUser(nouvelUtilisateur);

            Utilisateur utilisateurRecupere = utilisateurService.getUserById(2);
            System.out.println("Utilisateur récupéré : " + utilisateurRecupere);

            return utilisateurRecupere;

        } catch (SQLException e) {
            e.printStackTrace();
            session.close();
            return null;
        }
    }


}
