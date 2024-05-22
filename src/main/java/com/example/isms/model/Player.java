package com.example.isms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int player_id;
    private String name_;
    private String playertype;
    private String teamname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamname",nullable = false,insertable = false,updatable = false)
    @JsonIgnore
    private Team team;
}
