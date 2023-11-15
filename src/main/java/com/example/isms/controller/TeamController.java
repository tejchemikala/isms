package com.example.isms.controller;

import com.example.isms.model.Team;
import com.example.isms.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teams")
public class TeamController {
    @Autowired
    TeamService teamService;
    @GetMapping("allTeams")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }
}
