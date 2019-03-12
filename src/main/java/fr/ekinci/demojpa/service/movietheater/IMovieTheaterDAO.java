package fr.ekinci.demojpa.service.movietheater;

import fr.ekinci.demojpa.model.MovieEntity;
import fr.ekinci.demojpa.model.MovieTheaterEntity;

import java.sql.SQLException;
import java.util.List;

public interface IMovieTheaterDAO {
    MovieTheaterEntity insert(MovieTheaterEntity movieTheater) throws SQLException;
    void update(MovieTheaterEntity movieTheater) throws SQLException;
    void delete(MovieTheaterEntity movieTheater) throws SQLException;
    MovieTheaterEntity select(MovieTheaterEntity movieTheater) throws SQLException;
    List<MovieTheaterEntity> selectAll() throws SQLException;
}
