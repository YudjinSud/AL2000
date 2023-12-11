package com.al2000.Data.data;

public class Subs {

    private int userId;
    private int cardId;
    private String pseudo;
    private float balance;

    public Subs(){}

    public Subs(int userId, int cardId, String pseudo, float balance)
    {
        this.balance = balance;
        this.userId = userId;
        this.cardId = cardId;
        this.pseudo = pseudo;
    }

    public void setBalance(float balance){ this.balance = balance; }
    public float getBalance(){return balance; }
    public void setUserId(int userId){ this.userId = userId; }
    public int getUserId(){ return userId; }
    public void setCardId(int cardId){ this.cardId = cardId; }
    public int getCardId(){ return cardId; }
    public void setPseudo(String pseudo){ this.pseudo = pseudo; }
    public String getPseudo(){ return pseudo; }

    @Override
    public String toString() { 
        return "Subs [" +
                "userId="+ userId +
                ", cardId=" + cardId+
                ", pseudo=" + pseudo + 
                ", balance=" + balance + "]";
    }
}
