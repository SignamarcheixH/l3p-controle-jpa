package fr.ekinci.demojpa.service.customer;

import fr.ekinci.demojpa.model.CompanyEntity;
import fr.ekinci.demojpa.model.CustomerEntity;
import fr.ekinci.demojpa.repository.CompanyRepository;
import fr.ekinci.demojpa.repository.CustomerRepository;
import fr.ekinci.demojpa.service.company.ICompanyDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("springData")
public class CustomerDAO implements ICustomerDAO {

    private final CustomerRepository customerRepository;

    public CustomerDAO(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerEntity insert(CustomerEntity customer){
        return customerRepository.save(customer);
    }

    @Override
    public void update(CustomerEntity customer){
        customerRepository.save(customer);
    }

    @Override
    public void delete(CustomerEntity customer){
        customerRepository.delete(customer);
    }

    @Override
    public CustomerEntity select(CustomerEntity customer){
        return customerRepository.findById(customer.getId()).orElse(null);
    }

    @Override
    public List<CustomerEntity> selectAll(){
        return (List<CustomerEntity>) customerRepository.findAll();
    }
}