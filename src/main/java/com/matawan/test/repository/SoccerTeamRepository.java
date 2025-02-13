package com.matawan.test.repository;

import com.matawan.test.model.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoccerTeamRepository extends JpaRepository<Team, Long> {
    Page<Team> findAll(Pageable pageable);
}
