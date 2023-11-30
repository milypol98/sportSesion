package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.milypol.sportSesion.entity.Discipline;
@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
