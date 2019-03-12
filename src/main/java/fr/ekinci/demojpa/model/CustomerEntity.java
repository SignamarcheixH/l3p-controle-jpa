package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *
 CREATE TABLE customers (
 id integer,
 name varchar,
 date date,
 CONSTRAINT pk_customers PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_customers OWNED BY customers.id;
 -- Ou bien : ALTER TABLE customers ALTER COLUMN id SET DEFAULT nextval('sequence_customers');

 * @author Hugues SIGNAMARCHEIX
 */
@Entity
@Table(schema = "public", name = "customers")
public class CustomerEntity {
    /**
     * Reference of the customer
     * GeneratedValue by sequence in database
     */
    @Id
    @GeneratedValue(generator = "sequence_customers")
    private Long id;

    private String name;

    private Date date;

    @OneToMany(mappedBy = "reservations")
    private List<ShowEntity> reservations;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ShowEntity> getReservations() {
        return reservations;
    }

    public void setReservations(List<ShowEntity> reservations) {
        this.reservations = reservations;
    }
}
