package com.al2000.Data.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.al2000.Data.dao.MovieDao;
import com.al2000.Data.data.Movie;
import com.al2000.Data.tool.Session;

public class MovieService {
    public MovieService() {  }

    public ArrayList<Movie> downloadAllMovie() throws SQLException
    {
        Session session = new Session(false);
        session.open();
        MovieDao movieDao = new MovieDao(session.get());
        ArrayList<Integer> moviesId = movieDao.readAllMovieId();
        ArrayList<Movie> movies = new ArrayList<Movie>();
        for (Integer movieId : moviesId) {
            movies.add(movieDao.read(movieId));
        }
        session.close();
        return movies;
    }
}
