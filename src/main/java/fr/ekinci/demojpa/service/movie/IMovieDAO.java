package fr.ekinci.demojpa.service.movie;

import fr.ekinci.demojpa.model.CustomerEntity;
import fr.ekinci.demojpa.model.MovieEntity;

import java.sql.SQLException;
import java.util.List;

public interface IMovieDAO {
    MovieEntity insert(MovieEntity movie) throws SQLException;
    void update(MovieEntity movie) throws SQLException;
    void delete(MovieEntity movie) throws SQLException;
    MovieEntity select(MovieEntity movie) throws SQLException;
    List<MovieEntity> selectAll() throws SQLException;
}
