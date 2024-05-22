package com.example.isms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mat {
    @Id
    private int matchId;
    private String teamname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matchId",nullable = false,insertable = false,updatable = false)
    @JsonIgnore
    private Matches matches;

}
