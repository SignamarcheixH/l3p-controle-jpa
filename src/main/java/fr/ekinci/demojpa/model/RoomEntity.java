package fr.ekinci.demojpa.model;

import javax.persistence.*;
import java.util.List;

/**
 *
 CREATE TABLE rooms (
 id integer,
 nbPlaces integer,
 fk_id_theater integer,
 CONSTRAINT pk_rooms PRIMARY KEY(id)
 );

 CREATE SEQUENCE sequence_rooms OWNED BY rooms.id;
 -- Ou bien : ALTER TABLE rooms ALTER COLUMN id SET DEFAULT nextval('sequence_rooms');

 * @author Hugues SIGNAMARCHEIX
 */
@Entity
@Table(schema = "public", name = "rooms")
public class RoomEntity {
    /**
     * Reference of the room
     * GeneratedValue by sequence in database
     */
    @Id
    @GeneratedValue(generator = "sequence_rooms")
    private Long id;

    private Long nbPlaces;


    /**
     * SELECT * FROM
     * rooms
     * INNER JOIN theaters
     * ON rooms.fk_id_theater = theaters.id
     */
    @ManyToOne
    @JoinColumn(
            name = "fk_id_theater",
            referencedColumnName = "id"
    )
    private MovieTheaterEntity theater;

    @OneToMany(mappedBy = "show")
    private List<ShowEntity> shows;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(Long nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public MovieTheaterEntity getTheater() {
        return theater;
    }

    public void setTheater(MovieTheaterEntity theater) {
        this.theater = theater;
    }

    public List<ShowEntity> getShows() {
        return shows;
    }

    public void setShows(List<ShowEntity> shows) {
        this.shows = shows;
    }
}
