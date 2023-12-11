package com.al2000.Data.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.dao.UserHistoryDao;
import com.al2000.Data.data.UserHistory;
import com.al2000.Data.tool.Session;

public class UserHistoryService {
    public UserHistoryService() { }

    public void createNewUserHistory(int movieId, Date dateWatched, boolean isPhysical, int userId, int cardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserHistoryDao userHistoryDao = new UserHistoryDao(session.get());
        userHistoryDao.create(new UserHistory(movieId, dateWatched, isPhysical, userId, cardId));
        session.close();
    }
    public ArrayList<UserHistory> getAllHitories(int userId, int cardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserHistoryDao userHistoryDao = new UserHistoryDao(session.get());
        ArrayList<UserHistory> histories = userHistoryDao.read(userId, cardId);
        session.close();
        return histories;
    }
}
