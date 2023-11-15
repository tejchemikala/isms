package com.example.isms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Epr {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String relation_;
    private int playerId;
    private int eventId;
    private int matchId;
}
