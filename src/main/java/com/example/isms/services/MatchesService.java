package com.example.isms.services;

import com.example.isms.dao.MatchesDao;
import com.example.isms.model.Matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatchesService {
    @Autowired
    MatchesDao matchesDao;
    public List<Matches> getAllMatches() {
        return matchesDao.findAll();
    }
}
