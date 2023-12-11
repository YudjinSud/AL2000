package com.al2000.Data.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.dao.UserAdminDao;
import com.al2000.Data.data.UserAdmin;
import com.al2000.Data.tool.Session;

public class UserAdminService {

    public UserAdminService() { }

    public void addAdmin(int userId, int cardId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserAdminDao userAdminDao = new UserAdminDao(session.get());
        userAdminDao.create(new UserAdmin(userId,cardId));
        session.close();
    }
    public ArrayList<Integer> readAdmins(int userId) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserAdminDao userAdminDao = new UserAdminDao(session.get());
        ArrayList<Integer> cardIds = userAdminDao.read(userId);
        session.close();
        return cardIds;
    }
    public void deleteAdmins(UserAdmin userAdmin) throws SQLException
    {
        Session session = new Session(false);
        session.open();
        UserAdminDao userAdminDao = new UserAdminDao(session.get());
        userAdminDao.delete(userAdmin);
        session.close();
    }
}
