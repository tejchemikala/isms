package com.example.isms.services;

import com.example.isms.dao.PlayerDao;
import com.example.isms.model.Player;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerDao playerDao;
    public List<Player> getAllPlayers() {
        return playerDao.findAll();
    }

    public ResponseEntity<String> registerPlayer(Player player) {
        playerDao.save(player);
        return  new ResponseEntity<>("success",HttpStatus.CREATED);

    }
}
