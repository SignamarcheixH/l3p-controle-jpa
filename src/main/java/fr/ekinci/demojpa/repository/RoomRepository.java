package fr.ekinci.demojpa.repository;

import fr.ekinci.demojpa.model.ProductEntity;
import fr.ekinci.demojpa.model.RoomEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("springData")
public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
}
