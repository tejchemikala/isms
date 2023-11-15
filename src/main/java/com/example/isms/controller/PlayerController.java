package com.example.isms.controller;

import com.example.isms.model.Player;
import com.example.isms.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
