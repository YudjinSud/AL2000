package com.al2000.Core;

import java.util.ArrayList;

public class PriviliegedSub extends Subscriber {
    private ArrayList<Subscriber> card_list;

    public PriviliegedSub (int id, String pseudo, int card_id) {
        super(id, pseudo, card_id);
        card_list = new ArrayList<Subscriber>();
    }

    public void addRestrictedCategory (String category, Subscriber sub) {

    }

    public void addBalance (Subscriber s, float amount)  {

    }

    public float getBalance (Subscriber s) {
        return s.getSolde();
    }

    // à voir l'implémentation
    //public Subscriber createNewSubscriber () {
    //    return Subscriber();
    //}
}