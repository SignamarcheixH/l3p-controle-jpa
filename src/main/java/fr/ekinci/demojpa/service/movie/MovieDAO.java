package fr.ekinci.demojpa.service.movie;

import fr.ekinci.demojpa.model.CustomerEntity;
import fr.ekinci.demojpa.model.MovieEntity;
import fr.ekinci.demojpa.repository.CustomerRepository;
import fr.ekinci.demojpa.repository.MovieRepository;
import fr.ekinci.demojpa.service.customer.ICustomerDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("springData")
public class MovieDAO implements IMovieDAO {

    private final MovieRepository movieRepository;

    public MovieDAO(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieEntity insert(MovieEntity movie){
        return movieRepository.save(movie);
    }

    @Override
    public void update(MovieEntity movie){
        movieRepository.save(movie);
    }

    @Override
    public void delete(MovieEntity movie){
        movieRepository.delete(movie);
    }

    @Override
    public MovieEntity select(MovieEntity movie){
        return movieRepository.findById(movie.getId()).orElse(null);
    }

    @Override
    public List<MovieEntity> selectAll(){
        return (List<MovieEntity>) movieRepository.findAll();
    }
}