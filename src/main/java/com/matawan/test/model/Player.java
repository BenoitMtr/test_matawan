package com.matawan.test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Player entity
 */
@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "team_id")
    private int teamId;

    @Column(name = "name")
    private String name;

    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    private Position position;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", teamId=" + teamId +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
