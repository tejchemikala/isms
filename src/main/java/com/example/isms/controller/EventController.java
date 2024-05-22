package com.example.isms.controller;

import com.example.isms.model.Event;
import com.example.isms.model.EventRequest;
import com.example.isms.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("registerEvent")
    public ResponseEntity<String> putEventData(@RequestBody EventRequest eventRequest){
        return eventService.registerEventData(eventRequest);

    }




}
