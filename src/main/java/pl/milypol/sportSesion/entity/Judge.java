package pl.milypol.sportSesion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Judge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private User user;
}
