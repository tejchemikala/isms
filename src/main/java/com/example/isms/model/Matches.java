package com.example.isms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @OneToMany(mappedBy = "matches",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Mat> mats;

}
