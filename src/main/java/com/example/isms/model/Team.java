package com.example.isms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Team {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String teamname;
    private String manager;
    private String captian;
    @OneToMany(mappedBy = "team",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Player> players;
}
