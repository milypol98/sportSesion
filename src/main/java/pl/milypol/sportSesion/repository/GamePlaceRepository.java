package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.entity.GamePlace;

public interface GamePlaceRepository extends JpaRepository<GamePlace, Integer> {
}
