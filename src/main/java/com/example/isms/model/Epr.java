package com.example.isms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Epr {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int eventId;
    private String relation_;
    private int playerId;
    private int matchId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventId",nullable = false,insertable = false,updatable = false)
    @JsonIgnore
    private Event event;
}
