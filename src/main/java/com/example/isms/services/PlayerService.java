package com.example.isms.services;

import com.example.isms.dao.PlayerDao;
import com.example.isms.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerDao playerDao;
    public List<Player> getAllPlayers() {
        return playerDao.findAll();
    }
}
