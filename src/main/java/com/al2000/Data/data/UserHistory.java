package com.al2000.Data.data;

import java.util.ArrayList;
import java.util.Date;

public class UserHistory {

    private Movie movie;
    private Date dateWatched;
    private boolean isPhysical;

    private ArrayList<UserHistory> userHistories;

    public UserHistory(){}

    public UserHistory(Movie movie, Date dateWatched, boolean isPhysical, ArrayList<UserHistory> userHistories)
    {
        this.movie = movie;
        this.dateWatched = dateWatched;
        this.isPhysical = isPhysical;
        this.userHistories = userHistories;
    }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }
    public Date getDateWatched() { return dateWatched; }
    public void setDateWatched(Date dateWatched) { this.dateWatched = dateWatched; }
    public boolean isPhysical() { return isPhysical; }
    public void setPhysical(boolean physical) { isPhysical = physical; }
    public ArrayList<UserHistory> getUserHistories() { return userHistories; }
    public void setUserHistories(ArrayList<UserHistory> userHistories) { this.userHistories = userHistories; }

    @Override
    public String toString() {
        return "UserHistory [movie=" + movie +
                ", dateWatched=" + dateWatched +
                ", isPhysical=" + isPhysical +
                ", userHistories=" + userHistories + "]";
    }
}
