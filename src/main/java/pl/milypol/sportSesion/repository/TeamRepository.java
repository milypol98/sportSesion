package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.sportSesion.entity.Team;
import pl.milypol.sportSesion.entity.User;

public interface TeamRepository extends JpaRepository<Team,Integer> {
}
