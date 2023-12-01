package pl.milypol.sportSesion.controller;

import org.springframework.web.bind.annotation.*;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.service.DisciplineService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/disciplines")
public class DisciplineController {
    private final DisciplineService disciplineService;

    public DisciplineController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @PostMapping
    public void addDiscipline (@RequestBody Discipline discipline){
        disciplineService.addDiscipline(discipline);
    }
    @DeleteMapping
    public void removeDiscipline(@RequestParam(name = "discipline_id") Integer disciplineId){
        disciplineService.removeDiscipline(disciplineId);
    }
    @PutMapping
    public void updateDiscipline (@RequestBody Discipline discipline){
        disciplineService.updateDiscipline(discipline);
    }
    @GetMapping
    public Optional<Discipline> getDisciplineById(@RequestParam(name = "discipline_id") Integer disciplineId){
        return disciplineService.getDisciplineById(disciplineId);
    }
}
