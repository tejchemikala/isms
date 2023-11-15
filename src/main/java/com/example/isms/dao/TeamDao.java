package com.example.isms.dao;

import com.example.isms.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDao  extends JpaRepository<Team,String> {
}
