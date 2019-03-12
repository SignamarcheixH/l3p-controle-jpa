package fr.ekinci.demojpa.repository;

import fr.ekinci.demojpa.model.MovieTheaterEntity;
import fr.ekinci.demojpa.model.ProductEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("springData")
public interface MovieTheaterRepository extends CrudRepository<MovieTheaterEntity, Long> {
}
