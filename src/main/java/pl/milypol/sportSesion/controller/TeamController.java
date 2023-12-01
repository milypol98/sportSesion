package pl.milypol.sportSesion.controller;

import org.springframework.web.bind.annotation.*;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.entity.Team;
import pl.milypol.sportSesion.service.TeamService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    @PostMapping
    public void addTeam(@RequestBody Team team){
        teamService.addTeam(team);
    }
    @DeleteMapping
    public void removeTeam(@RequestParam(name = "team_id") Integer teamId){
        teamService.deleteTeam(teamId);
    }
    @PutMapping
    public void updateTeam(@RequestBody Team team){
        teamService.updateTeam(team);
    }
    @GetMapping
    public Optional<Team> getTeamById(@RequestParam(name = "team_id") Integer teamId){
        return teamService.getTeamById(teamId);
    }
    @GetMapping(value = "/name")
    public List<Team> getTeamListByName(@RequestParam(name = "place_id") String name){
        return teamService.getTeamListByName(name);
    }
    @GetMapping(value = "/sports")
    public List<Team> getTeamListBySportId(@RequestParam(name = "judge_id") Integer sportId){
        return teamService.getTeamListBySportId(sportId);
    }
    @GetMapping(value = "/users")
    public List<Team> getTeamListByUserId(@RequestParam(name = "guest_id") Integer userId){
        return teamService.getTeamListByUserId(userId);
    }
    @GetMapping(value = "/capitanes")
    public List<Team> getTeamListByCapitanId(@RequestParam(name = "host_id") Integer capitanId){
        return teamService.getTeamListByCapitanId(capitanId);
    }
}
