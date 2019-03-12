package fr.ekinci.demojpa.service.room;

import fr.ekinci.demojpa.model.MovieTheaterEntity;
import fr.ekinci.demojpa.model.RoomEntity;

import java.sql.SQLException;
import java.util.List;

public interface IRoomDAO {
    RoomEntity insert(RoomEntity movieTheater) throws SQLException;
    void update(RoomEntity movieTheater) throws SQLException;
    void delete(RoomEntity movieTheater) throws SQLException;
    RoomEntity select(RoomEntity movieTheater) throws SQLException;
    List<RoomEntity> selectAll() throws SQLException;
}
