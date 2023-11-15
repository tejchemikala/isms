package com.example.isms.controller;

import com.example.isms.model.Event;
import com.example.isms.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("events")
public class EventController {
    @Autowired
    EventService eventService;
    @GetMapping("allEvents")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }


}
