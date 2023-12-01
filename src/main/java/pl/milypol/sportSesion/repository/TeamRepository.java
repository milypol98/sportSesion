package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.milypol.sportSesion.entity.Team;
import pl.milypol.sportSesion.entity.User;

import java.util.List;

@Repository

public interface TeamRepository extends JpaRepository<Team,Integer> {
    List<Team> findAllByName(String name);
    List<Team> findAllByDisciplineId(Integer disciplineId);
    List<Team> findAllByUsersId(Integer usersId);
    List<Team> findAllByCapitanId(Integer capitanId);
}
