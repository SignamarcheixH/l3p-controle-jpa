package fr.ekinci.demojpa.service.customer;

import fr.ekinci.demojpa.model.CompanyEntity;
import fr.ekinci.demojpa.model.CustomerEntity;
import fr.ekinci.demojpa.model.ProductEntity;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {
    CustomerEntity insert(CustomerEntity customer) throws SQLException;
    void update(CustomerEntity customer) throws SQLException;
    void delete(CustomerEntity customer) throws SQLException;
    CustomerEntity select(CustomerEntity customer) throws SQLException;
    List<CustomerEntity> selectAll() throws SQLException;
}
