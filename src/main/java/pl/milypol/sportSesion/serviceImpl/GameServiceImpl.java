package pl.milypol.sportSesion.serviceImpl;

import org.springframework.stereotype.Service;
import pl.milypol.sportSesion.entity.Game;
import pl.milypol.sportSesion.repository.GameRepository;
import pl.milypol.sportSesion.service.GameService;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public void addGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public void deleteGame(Integer gameId) {
        gameRepository.deleteById(gameId);
    }

    @Override
    public void updateGame(Game game) {
        gameRepository.save(game);
    }

    @Override
    public Optional<Game> getGameById(Integer gameId) {
        return gameRepository.findById(gameId);
    }

    @Override
    public List<Game> getByPlaceId(Integer placeId) {
        return gameRepository.findAllByGamePlaceId(placeId);
    }

    @Override
    public List<Game> getByJudgeId(Integer judgeId) {
        return gameRepository.findAllByJudgeId(judgeId);
    }

    @Override
    public List<Game> getByGuestId(Integer guestId) {
        return gameRepository.findAllByGuestId(guestId);
    }

    @Override
    public List<Game> getByHostId(Integer hostId) {
        return gameRepository.findAllByHostId(hostId);
    }
}
