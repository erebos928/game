package sport.football.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sport.football.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
	List<Player> findAll();
}
