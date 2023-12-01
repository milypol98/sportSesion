package pl.milypol.sportSesion.controller;

import org.springframework.web.bind.annotation.*;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.entity.GamePlace;
import pl.milypol.sportSesion.service.GamePlaceService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/gamePlaces")
public class GamePlaceController {
    private final GamePlaceService gamePlaceService;

    public GamePlaceController(GamePlaceService gamePlaceService) {
        this.gamePlaceService = gamePlaceService;
    }
    @PostMapping
    public void addGamePlace(@RequestBody GamePlace place){
        gamePlaceService.addPlace(place);
    }
    @DeleteMapping
    public void removeGamePlace(@RequestParam(name = "place_id") Integer placeId){
        gamePlaceService.deletePlace(placeId);
    }
    @PutMapping
    public void updateGamePlace (@RequestBody GamePlace place){
        gamePlaceService.updatePlace(place);
    }
    @GetMapping
    public Optional<GamePlace> getGamePlaceById(@RequestParam(name = "place_id") Integer placeId){
        return gamePlaceService.getByGamePlaceId(placeId);
    }
}
