package com.matawan.test.api;

import com.matawan.test.model.Player;
import com.matawan.test.model.Team;
import com.matawan.test.service.PlayerService;
import com.matawan.test.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SoccerAPI: the controller of our API
 */
@RestController
public class SoccerAPI {

    @Autowired
    private TeamService teamService;

    @Autowired
    private PlayerService playerService;

    /**************** PLAYERS *****************/
    @GetMapping("/player")
    public List<Player> findAllPlayers() {
        return playerService.findAll();
    }

    @GetMapping(value = "/player/{id}")
    public Player findPlayerById(@PathVariable("id") Long id) {
        return playerService.findById(id);
    }

    /**************** TEAMS *****************/
    @GetMapping("/team")
    public Page<Team> findAllTeams(@RequestParam(defaultValue = "0") int page,
                                   @RequestParam(defaultValue = "2") int size,
                                   @RequestParam(defaultValue = "name") String sortBy,
                                   @RequestParam(defaultValue = "true") boolean ascending) {
        Sort sort = ascending ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        return teamService.findAll(PageRequest.of(page, size, sort));
    }

    @GetMapping(value = "/team/{id}")
    public Team findTeamById(@PathVariable("id") Long id) {
        return teamService.findById(id);
    }

    @PostMapping(value = "/team")
    public Team createTeam(@Validated @RequestBody Team team) {
        return teamService.save(team);
    }

}
