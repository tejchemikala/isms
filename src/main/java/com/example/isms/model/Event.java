package com.example.isms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int eventId;
    private String eventType;
    private String teama;
    private String teamb;
    private int matchId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "event")
    @JsonIgnore
    private List<Epr> eprs;

}
