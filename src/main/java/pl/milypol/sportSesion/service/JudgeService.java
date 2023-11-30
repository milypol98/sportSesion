package pl.milypol.sportSesion.service;

import pl.milypol.sportSesion.entity.Judge;

import java.util.Optional;

public interface JudgeService {
    void addJudge(Judge judge);
    void removeJudge(Integer judgeId);

    void updateJudge(Judge judge);

    Optional<Judge> getJudgeById(Integer judgeId);

}
