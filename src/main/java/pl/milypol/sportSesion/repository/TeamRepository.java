package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.milypol.sportSesion.entity.Team;
import pl.milypol.sportSesion.entity.User;
@Repository

public interface TeamRepository extends JpaRepository<Team,Integer> {
}
