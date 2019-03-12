package fr.ekinci.demojpa.service.company;

import fr.ekinci.demojpa.model.CompanyEntity;
import fr.ekinci.demojpa.model.ProductEntity;
import fr.ekinci.demojpa.repository.CompanyRepository;
import fr.ekinci.demojpa.repository.ProductRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Profile("springData")
public class CompanyDAO implements ICompanyDAO {

    private final CompanyRepository companyRepository;

    public CompanyDAO(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyEntity insert(CompanyEntity company){
        return companyRepository.save(company);
    }

    @Override
    public void update(CompanyEntity company){
        companyRepository.save(company);
    }

    @Override
    public void delete(CompanyEntity company){
        companyRepository.delete(company);
    }

    @Override
    public CompanyEntity select(CompanyEntity company){
        return companyRepository.findById(company.getId()).orElse(null);
    }

    @Override
    public List<CompanyEntity> selectAll(){
        return (List<CompanyEntity>) companyRepository.findAll();
    }
}