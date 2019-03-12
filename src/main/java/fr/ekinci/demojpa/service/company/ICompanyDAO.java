package fr.ekinci.demojpa.service.company;

import fr.ekinci.demojpa.model.CompanyEntity;
import fr.ekinci.demojpa.model.ProductEntity;

import java.sql.SQLException;
import java.util.List;

public interface ICompanyDAO {
    CompanyEntity insert(CompanyEntity company) throws SQLException;
    void update(CompanyEntity company) throws SQLException;
    void delete(CompanyEntity company) throws SQLException;
    CompanyEntity select(CompanyEntity company) throws SQLException;
    List<CompanyEntity> selectAll() throws SQLException;
}
