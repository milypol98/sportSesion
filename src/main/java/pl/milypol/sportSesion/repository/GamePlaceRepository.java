package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.entity.GamePlace;
@Repository

public interface GamePlaceRepository extends JpaRepository<GamePlace, Integer> {
}
