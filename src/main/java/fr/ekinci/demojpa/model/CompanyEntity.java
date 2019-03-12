package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

/**
 *
 CREATE TABLE companies (
 id integer,
 name varchar,
 CONSTRAINT pk_companies PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_companies OWNED BY companies.id;
 -- Ou bien : ALTER TABLE companies ALTER COLUMN id SET DEFAULT nextval('sequence_companies');

 * @author Hugues SIGNAMARCHEIX
 */
@Entity
@Table(schema = "public", name = "companies")
public class CompanyEntity {
    /**
     * Reference of the company
     * GeneratedValue by sequence in database
     */
    @Id
    @GeneratedValue(generator = "sequence_companies")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "company")
    private List<MovieTheaterEntity> theaters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MovieTheaterEntity> getTheaters() {
        return theaters;
    }

    public void setTags(List<MovieTheaterEntity> theaters) {
        this.theaters = theaters;
    }
}
