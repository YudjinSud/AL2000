package com.al2000.Core;

import com.al2000.Core.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FacadeDataFct {


    public void addSub(Subscriber Subscriber) {
        //SubsService subsService = new SubsService();
        //subsService.addCard(Subscriber.getUserId(), Subscriber.getPseudo(), Subscriber.getSolde());
    }

    public void updateSub(Subscriber Subscriber) {
        //SubsService subsService = new SubsService();
        //subsService.updateSub(Subscriber.getUserId(), Subscriber.getPseudo(), Subscriber.getSolde());
    }

//    public List<List> getMovies() {
//        //MovieService movieService = new MovieService();
//        // no return ?
//    }

    public ArrayList<String> getHistory(int cardId) {
        ArrayList<String> List = new ArrayList<>();
        // List = getDatabase
        return List;
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
