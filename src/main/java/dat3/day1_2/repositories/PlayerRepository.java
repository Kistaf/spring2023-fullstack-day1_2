package dat3.day1_2.repositories;

import dat3.day1_2.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface PlayerRepository extends CrudRepository<Player, Long> {

    @Query("SELECT p FROM Player p WHERE p.name = ?1")
    Player findByName(String name);
}
