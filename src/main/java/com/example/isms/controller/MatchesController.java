package com.example.isms.controller;

import com.example.isms.model.Mat;
import com.example.isms.model.MatchRequest;
import com.example.isms.model.Matches;
import com.example.isms.services.MatService;
import com.example.isms.services.MatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("matches")
public class MatchesController {
    @Autowired
    MatchesService matchesService;
    @Autowired
    MatService matService;
    @GetMapping("allMatches")
    public List<Matches> getAllMatches(){
        return matchesService.getAllMatches();
    }

    @PostMapping("registerMatch")
    public ResponseEntity<String>  registerMatch(@RequestBody MatchRequest matchRequest){
        System.out.println("This function is called");
        System.out.println(matchRequest);
        return matchesService.registerMatch(matchRequest);

    }
}
