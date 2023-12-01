package pl.milypol.sportSesion.controller;

import org.springframework.web.bind.annotation.*;
import pl.milypol.sportSesion.entity.Discipline;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.service.GameService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public void addGame (@RequestBody Game game){
        gameService.addGame(game);
    }
    @DeleteMapping
    public void removeGame(@RequestParam(name = "game_id") Integer gameId){
        gameService.deleteGame(gameId);
    }
    @PutMapping
    public void updateGame (@RequestBody Game game){
        gameService.updateGame(game);
    }
    @GetMapping
    public Optional<Game> getGameById(@RequestParam(name = "game_id") Integer gameId){
        return gameService.getGameById(gameId);
    }
    @GetMapping(value = "/place")
    public List<Game> getByPlaceId(@RequestParam(name = "place_id") Integer placeId){
        return gameService.getByPlaceId(placeId);
    }
    @GetMapping(value = "/judge")
    public List<Game> getByJudgeId(@RequestParam(name = "judge_id") Integer judgeId){
        return gameService.getByJudgeId(judgeId);
    }
    @GetMapping(value = "/guest")
    public List<Game> getByGuestId(@RequestParam(name = "guest_id") Integer guestId){
        return gameService.getByGuestId(guestId);
    }
    @GetMapping(value = "/host")
    public List<Game> getByHostId(@RequestParam(name = "host_id") Integer hostId){
        return gameService.getByHostId(hostId);
    }
}