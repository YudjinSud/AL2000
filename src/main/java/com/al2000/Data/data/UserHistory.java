package com.al2000.Data.data;

import java.sql.Date;

public class UserHistory {

    private int userId;
    private int cardId;
    private int movieId;
    private Date dateWatched;
    private boolean isPhysical;

    public UserHistory(){}

    public UserHistory(int movieid, Date dateWatched, boolean isPhysical, int userId, int cardId)
    {
        this.movieId = movieid;
        this.dateWatched = dateWatched;
        this.isPhysical = isPhysical;
        this.cardId = cardId;
        this.userId = userId;
    }
    public void setUserId(int userId){ this.userId = userId; }
    public int getUserId(){ return userId; }
    public void setCardId(int cardId){ this.cardId = cardId; }
    public int getCardId(){ return cardId; }
    public int getMovieId() { return movieId; }
    public void setMovieId(int movieId) { this.movieId = movieId; }
    public Date getDateWatched() { return dateWatched; }
    public void setDateWatched(Date dateWatched) { this.dateWatched = dateWatched; }
    public boolean isPhysical() { return isPhysical; }
    public void setPhysical(boolean physical) { isPhysical = physical; }

    @Override
    public String toString() {
        return "UserHistory [" +
                "userId="+ userId +
                ", cardId=" + cardId+
                ", movie=" + movieId +
                ", dateWatched=" + dateWatched +
                ", isPhysical=" + isPhysical +
                 "]";
    }
}
