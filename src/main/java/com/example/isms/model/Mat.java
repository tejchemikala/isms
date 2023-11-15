package com.example.isms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String teamname;
    private int matchId;
}
