package com.matawan.test.service;

import com.matawan.test.model.Player;
import com.matawan.test.repository.SoccerPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PlayerService: service managing the players
 */
@Service
public class PlayerService {

    @Autowired
    private SoccerPlayerRepository soccerPlayerRepository;

    /**
     * findAll: returns all players
     * @return all players
     */
    public List<Player> findAll() {
        return soccerPlayerRepository.findAll();
    }

    /**
     * findById: return the player associated to the id we put in parameter
     * @param id
     * @return the player corresponding to the id
     */
    public Player findById(long id) {
        return soccerPlayerRepository.findById(id).get();
    }
}
