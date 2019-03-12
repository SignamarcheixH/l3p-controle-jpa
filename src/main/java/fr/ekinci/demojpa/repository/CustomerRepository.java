package fr.ekinci.demojpa.repository;

import fr.ekinci.demojpa.model.CustomerEntity;
import fr.ekinci.demojpa.model.ProductEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;

@Profile("springData")
public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
}
