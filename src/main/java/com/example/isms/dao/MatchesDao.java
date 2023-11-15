package com.example.isms.dao;

import com.example.isms.model.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchesDao extends JpaRepository<Matches,String> {
}
