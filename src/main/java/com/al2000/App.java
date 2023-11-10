package com.al2000;

//import java.sql.SQLException;
//import com.tp.tool.Session;
//import com.tp.service.UtilisateurService;
//import com.tp.data.Utilisateur;

import com.al2000.GuiEntry;

public class App {

    public static void main(String[] args) {
        try {
            GuiEntry gui = new GuiEntry("Al 2000");
            GuiEntry.main(args);
            System.out.println("Hell");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}