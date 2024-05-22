package com.example.isms.services;

import com.example.isms.dao.MatDao;
import com.example.isms.dao.MatchesDao;
import com.example.isms.model.Mat;
import com.example.isms.model.MatchRequest;
import com.example.isms.model.Matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatchesService {
    @Autowired
    MatchesDao matchesDao;
    @Autowired
    MatService matService;
    public List<Matches> getAllMatches() {
        return matchesDao.findAll();
    }

    public ResponseEntity<String> registerMatch(MatchRequest matchRequest) {
        matchesDao.save(matchRequest.getMatches());
        int id = matchRequest.getMatches().getMatchId();
        for(int i=0;i<matchRequest.getMatList().size();i++){
            matchRequest.getMatList().get(i).setMatchId(id);
            ResponseEntity<String> s = matService.fill(matchRequest.getMatList().get(i));
        }
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
