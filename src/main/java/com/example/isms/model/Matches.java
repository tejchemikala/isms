package com.example.isms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int matchId;
    private String  date;
    private String result;
    private String venue;
    private String matchstatus;
}
