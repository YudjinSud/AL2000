package com.al2000.Data.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.dao.RestrictedCatDao;
import com.al2000.Data.data.RestrictedCat;
import com.al2000.Data.tool.Session;

public class RestrictedCatService {
    public RestrictedCatService() { }

    public boolean addRestrictedCat(RestrictedCat restrictedCat) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        RestrictedCatDao restrictedCatDao = new RestrictedCatDao(session.get());
        restrictedCatDao.create(restrictedCat);
        session.close();
        return true;
    }

    public ArrayList<RestrictedCat> restrictedCats(int userId, int cardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        RestrictedCatDao restrictedCatDao = new RestrictedCatDao(session.get());
        ArrayList<RestrictedCat> cats = new ArrayList<RestrictedCat>();
        cats = restrictedCatDao.read(userId, cardId);
        return cats;
    }

    public boolean deleteRestrictedCat(RestrictedCat restrictedCat) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        RestrictedCatDao restrictedCatDao = new RestrictedCatDao(session.get());
        restrictedCatDao.delete(restrictedCat);
        session.close();
        return true;
    }
}
