package com.matawan.test.repository;

import com.matawan.test.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoccerPlayerRepository extends JpaRepository<Player, Long> {
}
