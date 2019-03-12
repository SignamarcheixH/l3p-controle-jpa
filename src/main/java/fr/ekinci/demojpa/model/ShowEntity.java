package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

/**
 *
 CREATE TABLE shows (
 id integer,
 langue varchar,
 sousTitres
 price float,
 fk_id_movie integer,
 fk_id_room integer,
 CONSTRAINT pk_shows PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_shows OWNED BY shows.id;
 -- Ou bien : ALTER TABLE shows ALTER COLUMN id SET DEFAULT nextval('sequence_shows');

 * @author Hugues SIGNAMARCHEIX
 */
@Entity
@Table(schema = "public", name = "shows")
public class ShowEntity {
    /**
     * Reference of the show
     * GeneratedValue by sequence in database
     */
    @Id
    @GeneratedValue(generator = "sequence_shows")
    private Long id;

    /**
     * SELECT * FROM
     * shows
     * INNER JOIN  movies
     * ON shows.fk_id_movie = movies.id
     */
    @OneToOne
    @JoinColumn(
            name = "fk_id_movie",
            referencedColumnName = "id"
    )
    private MovieEntity movie;


    /**
     * SELECT * FROM
     * rooms
     * INNER JOIN theaters
     * ON rooms.fk_id_theater = theaters.id
     */
    @ManyToOne
    @JoinColumn(
            name = "fk_id_room",
            referencedColumnName = "id"
    )
    private MovieTheaterEntity show;

    @OneToOne(mappedBy = "reservations")
    private ProductEntity product;

     private String language;

    private boolean subtitles;

    /** price in cents */
    private float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public MovieTheaterEntity getShow() {
        return show;
    }

    public void setShow(MovieTheaterEntity show) {
        this.show = show;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
