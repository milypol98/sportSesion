package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.entity.Judge;
@Repository

public interface JudgeRepository extends JpaRepository<Judge, Integer> {
}
