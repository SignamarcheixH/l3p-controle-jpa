package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

/**
 *
 CREATE TABLE theaters (
 id integer,
 fk_id_company integer,
 CONSTRAINT pk_theaters PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_theaters OWNED BY theaters.id;
 -- Ou bien : ALTER TABLE theaters ALTER COLUMN id SET DEFAULT nextval('sequence_theaters');

 * @author Hugues SIGNAMARCHEIX
 */
@Entity
@Table(schema = "public", name = "theaters")
public class MovieTheaterEntity {
    /**
     * Reference of the theater
     * GeneratedValue by sequence in database
     */
    @Id
    @GeneratedValue(generator = "sequence_theaters")
    private Long id;

    /**
     * SELECT * FROM
     * theaters
     * INNER JOIN companies
     * ON theaters.fk_id_company = companies.id
     */
    @ManyToOne
    @JoinColumn(
            name = "fk_id_company",
            referencedColumnName = "id"
    )
    private CompanyEntity company;

    @OneToMany(mappedBy = "theater")
    private List<RoomEntity> theaters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public List<RoomEntity> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<RoomEntity> theaters) {
        this.theaters = theaters;
    }
}
