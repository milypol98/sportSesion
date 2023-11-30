package pl.milypol.sportSesion.service;

import pl.milypol.sportSesion.entity.Game;

import java.util.List;
import java.util.Optional;

public interface GameService {
    void addGame(Game game);
    void deleteGame(Integer gameId);
    void updateGame(Game game);
    Optional<Game> getGameById(Integer gameId);
    List<Game> getByPlaceId(Integer placeId);
    List<Game> getByJudgeId(Integer judgeId);
    List<Game> getByGuestId(Integer judgeId);
    List<Game> getByHostId(Integer judgeId);


}
