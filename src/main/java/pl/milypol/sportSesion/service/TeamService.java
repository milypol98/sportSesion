package pl.milypol.sportSesion.service;

import pl.milypol.sportSesion.entity.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    void addTeam(Team team);
    void deleteTeam(Integer teamId);
    void updateTeam(Team team);
    Optional<Team> getTeamById(Integer teamId);
    List<Team> getTeamListByName(String name);
    List<Team> getTeamListBySportId(Integer sportId);
    List<Team> getTeamListByUserId(Integer userId);
    List<Team> getTeamListByCapitanId(Integer capitanId);

}
