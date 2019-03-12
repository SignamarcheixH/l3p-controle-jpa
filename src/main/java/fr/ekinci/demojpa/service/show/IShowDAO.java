package fr.ekinci.demojpa.service.show;

import fr.ekinci.demojpa.model.MovieTheaterEntity;
import fr.ekinci.demojpa.model.ShowEntity;

import java.sql.SQLException;
import java.util.List;

public interface IShowDAO {
    ShowEntity insert(ShowEntity show) throws SQLException;
    void update(ShowEntity show) throws SQLException;
    void delete(ShowEntity show) throws SQLException;
    ShowEntity select(ShowEntity show) throws SQLException;
    List<ShowEntity> selectAll() throws SQLException;
}
