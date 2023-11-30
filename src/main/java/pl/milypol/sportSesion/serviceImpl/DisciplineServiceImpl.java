package pl.milypol.sportSesion.serviceImpl;

import org.springframework.stereotype.Service;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.repository.DisciplineRepository;
import pl.milypol.sportSesion.service.DisciplineService;

import java.util.Optional;

@Service
public class DisciplineServiceImpl implements DisciplineService {
    private final DisciplineRepository disciplineRepository;

    public DisciplineServiceImpl(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    @Override
    public void addDiscipline(Discipline discipline) {
        disciplineRepository.save(discipline);
    }

    @Override
    public void removeDiscipline(Integer disciplineId) {
        disciplineRepository.deleteById(disciplineId);
    }

    @Override
    public void updateDiscipline(Discipline discipline) {
        disciplineRepository.save(discipline);
    }

    @Override
    public Optional<Discipline> getDisciplineById(Integer disciplineId) {
        return disciplineRepository.findById(disciplineId);
    }
}
