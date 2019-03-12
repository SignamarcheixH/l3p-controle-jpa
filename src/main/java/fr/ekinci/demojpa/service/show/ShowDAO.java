package fr.ekinci.demojpa.service.show;

import fr.ekinci.demojpa.model.MovieTheaterEntity;
import fr.ekinci.demojpa.model.ShowEntity;
import fr.ekinci.demojpa.repository.MovieTheaterRepository;
import fr.ekinci.demojpa.repository.ShowRepository;
import fr.ekinci.demojpa.service.movietheater.IMovieTheaterDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("springData")
public class ShowDAO implements IShowDAO {

    private final ShowRepository showRepository;

    public ShowDAO(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    @Override
    public ShowEntity insert(ShowEntity show){
        return showRepository.save(show);
    }

    @Override
    public void update(ShowEntity show){
        showRepository.save(show);
    }

    @Override
    public void delete(ShowEntity show){
        showRepository.delete(show);
    }

    @Override
    public ShowEntity select(ShowEntity show){
        return showRepository.findById(show.getId()).orElse(null);
    }

    @Override
    public List<ShowEntity> selectAll(){
        return (List<ShowEntity>) showRepository.findAll();
    }
}