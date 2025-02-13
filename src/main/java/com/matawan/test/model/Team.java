package com.matawan.test.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Team entity
 */
@Entity
@Table(name = "team")
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "acronym")
    @NotBlank
    private String acronym;

    @OneToMany(fetch= FetchType.EAGER, cascade= CascadeType.ALL, mappedBy = "teamId")
    private List<Player> players;

    @Column(name = "budget")
    @NotNull
    private int budget;

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acronym='" + acronym + '\'' +
                ", players=" + players +
                ", budget=" + budget +
                '}';
    }
}
