package com.example.isms.model;

import com.example.isms.model.Event;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class EventRequest {
    public Event event;
    public List<Epr> eprs;



}
