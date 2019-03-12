package fr.ekinci.demojpa.controller;

import fr.ekinci.demojpa.model.CompanyEntity;
import fr.ekinci.demojpa.model.ProductEntity;
import fr.ekinci.demojpa.service.IProductDAO;
import fr.ekinci.demojpa.service.company.ICompanyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;

@RestController
public class ProductController {

    private final ICompanyDAO companyService;

    @Autowired
    public CompanyController(
            ICompanyDAO companyService
    ) {
        this.companyService = companyService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/companies")
    public CompanyEntity post(@RequestBody CompanyEntity company) throws SQLException {
        return companyService.insert(company);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/companies/{id}")
    public CompanyEntity get(@PathVariable("id") Long id) throws SQLException {
        CompanyEntity company = new CompanyEntity();
        company.setId(id);
        return companyService.select(company);
    }
}
