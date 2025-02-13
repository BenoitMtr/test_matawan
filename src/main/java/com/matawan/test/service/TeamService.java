package com.matawan.test.service;

import com.matawan.test.model.Team;
import com.matawan.test.repository.SoccerTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * TeamService: service managing the teams
 */
@Service
public class TeamService {
    @Autowired
    private SoccerTeamRepository soccerTeamRepository;

    /**
     * findAll: Returns all teams
     * @param pageable
     * @return
     */
    public Page<Team> findAll(Pageable pageable) {
        return soccerTeamRepository.findAll(pageable);
    }

    /**
     * findById: Returns the team associated to the id put in parameter
     * @param id the id of the team we're looking for
     * @return the team associated to the id we put in parameter
     */
    public Team findById(long id) {
        return soccerTeamRepository.findById(id).get();
    }

    /**
     * save: saves a new team to the database
     * @param team the team to save
     * @return the created team
     */
    public Team save(Team team) {
        return soccerTeamRepository.save(team);
    }
}
