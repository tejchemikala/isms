package com.example.isms.controller;

import com.example.isms.model.Player;
import com.example.isms.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("players")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping("allPlayers")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }
    @PostMapping("registerPlayer")
    public ResponseEntity<String> registerPlayer(@RequestBody Player player){
        return playerService.registerPlayer(player);
    }
    @PostMapping("registerPlayers")
    public ResponseEntity<String> registerPlayers(@RequestBody List<Player> players){
        ResponseEntity<String> response =new ResponseEntity<>("success", HttpStatus.CREATED);;
        for(int i=0;i< players.size();i++){
            response = playerService.registerPlayer(players.get(i));
        }
        return response;
    }

}
