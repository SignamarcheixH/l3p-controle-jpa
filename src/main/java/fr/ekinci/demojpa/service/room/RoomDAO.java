package fr.ekinci.demojpa.service.room;

import fr.ekinci.demojpa.model.MovieTheaterEntity;
import fr.ekinci.demojpa.model.RoomEntity;
import fr.ekinci.demojpa.repository.MovieTheaterRepository;
import fr.ekinci.demojpa.repository.RoomRepository;
import fr.ekinci.demojpa.service.movietheater.IMovieTheaterDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("springData")
public class RoomDAO implements IRoomDAO {

    private final RoomRepository roomRepository;

    public RoomDAO(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public RoomEntity insert(RoomEntity room){
        return roomRepository.save(room);
    }

    @Override
    public void update(RoomEntity room){
        roomRepository.save(room);
    }

    @Override
    public void delete(RoomEntity room){
        roomRepository.delete(room);
    }

    @Override
    public RoomEntity select(RoomEntity room){
        return roomRepository.findById(room.getId()).orElse(null);
    }

    @Override
    public List<RoomEntity> selectAll(){
        return (List<RoomEntity>) roomRepository.findAll();
    }
}