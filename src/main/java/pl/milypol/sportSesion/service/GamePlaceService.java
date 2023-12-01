package pl.milypol.sportSesion.service;

import pl.milypol.sportSesion.entity.GamePlace;

import java.util.Optional;

public interface GamePlaceService {
    void addPlace(GamePlace gamePlace);
    void deletePlace(Integer placeId);
    void updatePlace(GamePlace gamePlace);
    Optional<GamePlace> getByGamePlaceId(Integer placeId);
}
