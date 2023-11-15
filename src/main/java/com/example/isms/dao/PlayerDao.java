package com.example.isms.dao;

import com.example.isms.model.Event;
import com.example.isms.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDao extends JpaRepository<Player,String> {

}


