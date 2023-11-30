package pl.milypol.sportSesion.serviceImpl;

import org.springframework.stereotype.Service;
import pl.milypol.sportSesion.entity.GamePlace;
import pl.milypol.sportSesion.repository.GamePlaceRepository;
import pl.milypol.sportSesion.service.GamePlaceService;

import java.util.Optional;

@Service
public class GamePlaceServiceImpl implements GamePlaceService {
    private final GamePlaceRepository gamePlaceRepository;

    public GamePlaceServiceImpl(GamePlaceRepository gamePlaceRepository) {
        this.gamePlaceRepository = gamePlaceRepository;
    }

    @Override
    public void addPlace(GamePlace gamePlace) {
        gamePlaceRepository.save(gamePlace);
    }

    @Override
    public void deletePlace(Integer placeId) {
        gamePlaceRepository.deleteById(placeId);
    }

    @Override
    public void updatePlace(GamePlace gamePlace) {
        gamePlaceRepository.save(gamePlace);
    }

    @Override
    public Optional<GamePlace> getById(Integer placeId) {
        return gamePlaceRepository.findById(placeId);
    }
}
