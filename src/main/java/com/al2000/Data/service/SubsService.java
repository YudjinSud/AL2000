package com.al2000.Data.service;

import java.sql.SQLException;

import com.al2000.Data.dao.SubsDao;
import com.al2000.Data.data.Subs;
import com.al2000.Data.tool.Session;

public class SubsService {
    public SubsService() {  }

    public boolean addCard(int userId,int cardId, String pseudo, float balance) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        SubsDao subsDao = new SubsDao(session.get());
        subsDao.create(userId,cardId, pseudo, balance);
        session.close();
        return true;
    }
    public Subs readSub(int userId, int cardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        SubsDao subsDao = new SubsDao(session.get());
        Subs sub = subsDao.read(userId, cardId);
        session.close();
        return sub;
    }
    public boolean updateSub(int userId, int cardId, String pseudo, float balance) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        SubsDao subsDao = new SubsDao(session.get());
        subsDao.update(new Subs(userId,cardId,pseudo,balance));
        session.close();
        return true;
    }
    public boolean deleteSub(int userId, int cardId, String pseudo, float balance) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        SubsDao subsDao = new SubsDao(session.get());
        subsDao.delete(new Subs(userId,cardId,pseudo,balance));
        session.close();
        return true;
    }
}
