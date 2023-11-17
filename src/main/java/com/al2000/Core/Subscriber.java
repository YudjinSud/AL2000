package com.al2000.Core;

import java.util.ArrayList;

public class Subscriber extends User {
    private float solde;
    private int card_id;
    private boolean blocked;
    private ArrayList<String> restricted;
    public String pseudo;

    public Subscriber (int id, String pseudo, int card_id) {
        this.id = id;
        this.pseudo = pseudo;
        this.card_id = card_id;
        this.solde = 0.f;
        this.blocked = false;
        this.restricted = new ArrayList<String>();
    }

    public String getHistory () {
        return "";
    }

    public void setSolde (float solde) {
        this.solde = solde;
    }

    public float getSolde () {
        return solde;
    }
}