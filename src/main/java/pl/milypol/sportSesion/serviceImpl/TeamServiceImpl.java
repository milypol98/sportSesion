package pl.milypol.sportSesion.serviceImpl;

import org.springframework.stereotype.Service;
import pl.milypol.sportSesion.entity.Team;
import pl.milypol.sportSesion.repository.TeamRepository;
import pl.milypol.sportSesion.service.TeamService;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public void addTeam(Team team) {
        teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Integer teamId) {
        teamRepository.deleteById(teamId);
    }

    @Override
    public void updateTeam(Team team) {
        teamRepository.save(team);
    }

    @Override
    public Optional<Team> getTeamById(Integer teamId) {
        return teamRepository.findById(teamId);
    }

    @Override
    public List<Team> getTeamListByName(String name) {
        return teamRepository.findAllByName(name);
    }

    @Override
    public List<Team> getTeamListBySportId(Integer sportId) {
        return teamRepository.findAllByDisciplineId(sportId);
    }

    @Override
    public List<Team> getTeamListByUserId(Integer userId) {
        return teamRepository.findAllByUsersId(userId);
    }

    @Override
    public List<Team> getTeamListByCapitanId(Integer capitanId) {
        return teamRepository.findAllByCapitanId(capitanId);
    }
}
