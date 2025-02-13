CREATE TABLE team (
    id      INTEGER NOT NULL AUTO_INCREMENT,
    name    VARCHAR(64) NOT NULL,
    acronym VARCHAR(64) NOT NULL,
    budget  INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE player (
    id          INTEGER NOT NULL AUTO_INCREMENT,
    team_id     INTEGER,
    name        VARCHAR(64) NOT NULL,
    position    VARCHAR(20) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (team_id) REFERENCES team(id)
);