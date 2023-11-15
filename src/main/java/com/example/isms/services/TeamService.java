package com.example.isms.services;

import com.example.isms.dao.TeamDao;
import com.example.isms.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.security.PublicKey;

@Service
public class TeamService {
    @Autowired
    TeamDao teamDao;
    public List<Team> getAllTeams(){
        return teamDao.findAll();
    }
}
