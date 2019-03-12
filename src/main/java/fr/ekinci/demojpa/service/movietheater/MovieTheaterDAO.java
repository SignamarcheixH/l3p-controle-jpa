package fr.ekinci.demojpa.service.movietheater;

import fr.ekinci.demojpa.model.MovieEntity;
import fr.ekinci.demojpa.model.MovieTheaterEntity;
import fr.ekinci.demojpa.repository.MovieRepository;
import fr.ekinci.demojpa.repository.MovieTheaterRepository;
import fr.ekinci.demojpa.service.movie.IMovieDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("springData")
public class MovieTheaterDAO implements IMovieTheaterDAO {

    private final MovieTheaterRepository movieTheaterRepository;

    public MovieTheaterDAO(MovieTheaterRepository movieTheaterRepository) {
        this.movieTheaterRepository = movieTheaterRepository;
    }

    @Override
    public MovieTheaterEntity insert(MovieTheaterEntity movieTheater){
        return movieTheaterRepository.save(movieTheater);
    }

    @Override
    public void update(MovieTheaterEntity movieTheater){
        movieTheaterRepository.save(movieTheater);
    }

    @Override
    public void delete(MovieTheaterEntity movieTheater){
        movieTheaterRepository.delete(movieTheater);
    }

    @Override
    public MovieTheaterEntity select(MovieTheaterEntity movieTheater){
        return movieTheaterRepository.findById(movieTheater.getId()).orElse(null);
    }

    @Override
    public List<MovieTheaterEntity> selectAll(){
        return (List<MovieTheaterEntity>) movieTheaterRepository.findAll();
    }
}