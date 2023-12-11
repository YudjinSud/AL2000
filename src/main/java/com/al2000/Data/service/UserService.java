package com.al2000.Data.service;


import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.dao.UserDao;
import com.al2000.Data.data.User;
import com.al2000.Data.tool.Session;


public class UserService {
    public UserService() { }

    public void createNewUser(int creditCardId,int userId, int cardId, float balance, String pseudo) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserDao userDao = new UserDao(session.get());
        SubsService subsService = new SubsService();
        userDao.create(userId, creditCardId);
        subsService.addCard(userId,cardId, pseudo, balance);
        session.close();
    }
    public ArrayList<Integer> getAllSubs(int userId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserDao userDao = new UserDao(session.get());
        ArrayList<Integer> subs = userDao.read(userId);
        session.close();
        return subs;
    }
    public void updateCreditCard(int userId,int creditCardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserDao userDao = new UserDao(session.get());
        userDao.update(new User(userId, creditCardId));
        session.close();
    }
    public void deleteCreditCard(int userId,int creditCardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserDao userDao = new UserDao(session.get());
        userDao.update(new User(userId, creditCardId));
        session.close();
    }
}

