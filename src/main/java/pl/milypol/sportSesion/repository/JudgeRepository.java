package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.entity.Judge;

public interface JudgeRepository extends JpaRepository<Judge, Integer> {
}
