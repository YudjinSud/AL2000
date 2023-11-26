package com.al2000.Data;

import com.al2000.Data.data.User;
import com.al2000.Data.service.MovieService;
import com.al2000.Data.service.UserHistoryService;
import com.al2000.Data.service.UserService;
import com.al2000.Data.tool.DatabaseConnection;
import com.al2000.Data.tool.Session;

import java.sql.Connection;
import java.sql.SQLException;

public class FacadeDataFct {



    public FacadeDataFct ()
    { }

    public void addUser() throws SQLException
    { 
        Session session = new Session(false);
        UserService userService = new UserService(session);

        userService.createUser();
    }
 
}
