package com.example.isms.controller;

import com.example.isms.model.Team;
import com.example.isms.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("registerTeam")
    public ResponseEntity<String> registerTeam(@RequestBody Team team){
        teamService.registerTeam(team);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
    @PostMapping("registerTeams")
    public ResponseEntity<String> registerTeam(@RequestBody List<Team> teams){
        ResponseEntity<String> response = new ResponseEntity<>("success", HttpStatus.CREATED);
        for(int i=0;i<teams.size();i++){
            response = teamService.registerTeam(teams.get(i));
        }
        return response;

    }
}
