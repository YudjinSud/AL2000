package com.al2000.Core;
import com.al2000.Data.data.Utilisateur;

public class UserFactory {
    public Subscriber createSubscriber (Utilisateur u) {
        return new Subscriber(u.getId(), u.getNom(), 0);
    }
}