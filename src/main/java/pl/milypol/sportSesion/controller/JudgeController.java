package pl.milypol.sportSesion.controller;

import org.springframework.web.bind.annotation.*;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.entity.Judge;
import pl.milypol.sportSesion.service.JudgeService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/judges")
public class JudgeController {
    private final JudgeService judgeService;

    public JudgeController(JudgeService judgeService) {
        this.judgeService = judgeService;
    }
    @PostMapping
    public void addJudge (@RequestBody Judge judge){
        judgeService.addJudge(judge);
    }
    @DeleteMapping
    public void removeJudge(@RequestParam(name = "judge_id") Integer judgeId){
        judgeService.removeJudge(judgeId);
    }
    @PutMapping
    public void updateJudge (@RequestBody Judge judge){
        judgeService.updateJudge(judge);
    }
    @GetMapping
    public Optional<Judge> getJudgeById(@RequestParam(name = "judge_id") Integer judgeId){
        return judgeService.getJudgeById(judgeId);
    }
}
