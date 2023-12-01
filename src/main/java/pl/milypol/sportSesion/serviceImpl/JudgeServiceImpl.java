package pl.milypol.sportSesion.serviceImpl;

import org.springframework.stereotype.Service;
import pl.milypol.sportSesion.entity.Judge;
import pl.milypol.sportSesion.repository.JudgeRepository;
import pl.milypol.sportSesion.service.JudgeService;

import java.util.Optional;

@Service
public class JudgeServiceImpl implements JudgeService {
    private final JudgeRepository judgeRepository;

    public JudgeServiceImpl(JudgeRepository judgeRepository) {
        this.judgeRepository = judgeRepository;
    }

    @Override
    public void addJudge(Judge judge) {
        judgeRepository.save(judge);
    }

    @Override
    public void removeJudge(Integer judgeId) {
        judgeRepository.deleteById(judgeId);
    }

    @Override
    public void updateJudge(Judge judge) {
        judgeRepository.save(judge);
    }

    @Override
    public Optional<Judge> getJudgeById(Integer judgeId) {
        return judgeRepository.findById(judgeId);
    }
}
