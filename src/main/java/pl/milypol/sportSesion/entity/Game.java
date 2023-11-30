package pl.milypol.sportSesion.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private GamePlace gamePlace;
    private Date date;
    @OneToOne
    private Team guest;
    @OneToOne
    private Team host;
    private Integer guestScore;
    private Integer hostScore;
    @OneToOne
    private Judge judge;

}
