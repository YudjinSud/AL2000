package com.al2000;

//import java.sql.SQLException;
//import com.tp.tool.Session;
//import com.tp.service.UtilisateurService;
//import com.tp.data.Utilisateur;

import com.al2000.Data.DataService;
import com.al2000.Data.data.Utilisateur;
import com.al2000.GUI.GuiEntry;

import com.al2000.Core.UserFactory;
import com.al2000.Core.Subscriber;


import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        try {
            DataService dataService = new DataService();
            Utilisateur user = dataService.getUser();

            UserFactory user_factory = new UserFactory();
            Subscriber s = user_factory.createSubscriber(user);
            System.out.println(s.pseudo + " a un solde de : " + s.getSolde());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}