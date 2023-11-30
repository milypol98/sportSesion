package pl.milypol.sportSesion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.milypol.sportSesion.entity.Game;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {
    List<Game> findAllByGamePlaceId(Integer gamePlaceId);
    List<Game> findAllByJudgeId(Integer judgeId);
    List<Game> findAllByGuestId(Integer guestId);
    List<Game> findAllByHostId(Integer hostId);
}
