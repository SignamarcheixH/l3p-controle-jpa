package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *
 CREATE TABLE movies (
 id integer,
 producer varchar,
 mainActor varchar,
 category varchar,
 date date,
 duration flaat,
 pegi integer,
 CONSTRAINT pk_movies PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_movies OWNED BY movies.id;
 -- Ou bien : ALTER TABLE movies ALTER COLUMN id SET DEFAULT nextval('sequence_movies');

 * @author Hugues SIGNAMARCHEIX
 */
@Entity
@Table(schema = "public", name = "movies")
public class MovieEntity {
    /**
     * Reference of the movie
     * GeneratedValue by sequence in database
     */
    @Id
    @GeneratedValue(generator = "sequence_movies")
    private Long id;

    private String producer;

    private String mainActor;

    private String category;

    private Date date;

    private float duration;

    private String pegi;

    @OneToMany(mappedBy = "movie")
    private ShowEntity show;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getPegi() {
        return pegi;
    }

    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public ShowEntity getShow() {
        return show;
    }

    public void setShow(ShowEntity show) {
        this.show = show;
    }




}
