package com.example.isms.controller;

import com.example.isms.model.Matches;
import com.example.isms.services.MatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("matches")
public class MatchesController {
    @Autowired
    MatchesService matchesService;
    @GetMapping("allMatches")
    public List<Matches> getAllMatches(){
        return matchesService.getAllMatches();
    }
}
