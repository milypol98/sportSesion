package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.sportSesion.entity.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
