package com.al2000.Data.service;


import java.sql.SQLException;
import java.util.List;

import com.al2000.Data.dao.UserDao;
import com.al2000.Data.tool.Session;
import com.al2000.Data.data.User;


public class UserService {

    private Session session;

    public UserService(Session session) {
        this.session = session;
    }

    public void createUser() throws SQLException {
        try {
            session.open();
            UserDao utilisateurDao = new UserDao(session.get());
            utilisateurDao.create();
            session.commit();
            session.close();
        } catch (SQLException e) {
            session.rollback();
            session.close();
            throw e;
        }
    }
}
