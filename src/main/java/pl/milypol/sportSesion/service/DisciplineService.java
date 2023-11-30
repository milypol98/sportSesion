package pl.milypol.sportSesion.service;

import pl.milypol.sportSesion.entity.Discipline;

import java.util.Optional;

public interface DisciplineService {
    void addDiscipline(Discipline discipline);
    void removeDiscipline(Integer disciplineId);
    void updateDiscipline(Discipline discipline);

    Optional<Discipline> getDisciplineById(Integer disciplineId);
}
