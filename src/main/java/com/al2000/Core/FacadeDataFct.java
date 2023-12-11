package com.al2000.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.al2000.Data.data.Subs;
import com.al2000.Data.service.MovieService;
import com.al2000.Data.service.SubsService;
import com.al2000.Data.tool.Session;


public class FacadeDataFct {


    public void addSub(Subscriber Subscriber) {
        SubsService subsService = new SubsService();
        subsService.addCard(Subscriber.getUserId(), Subscriber.getPseudo(), Subscriber.getSolde());
    }

    public void updateSub(Subscriber Subscriber) {
        SubsService subsService = new SubsService();
        subsService.updateSub(Subscriber.getUserId(), Subscriber.getPseudo(), Subscriber.getSolde());
    }
    public List<Subscribers> getSub() {
        //return database.getSub();
    }

    public List<Movie> getMovies() {
        MovieService movieService = new MovieService();
        // no return ? 
        
    }

    public List<SubscriberHisotory> getHistory(int cardId) {

    }
    
    public void setSolde(int cardId, float newSolde) {

    }

    public void addCard(int userId, int newCardId) {

    }


    public void delRestrictedCat(int cardId, String cat) {

    }

    public void addRestrictedCat(int cardId, String cat) {

    }



    // public void addSubHistory(Subscriber subscriptionHistory) {
    //     database.addSubscriptionHistory(subscriptionHistory);
    //     }


}
