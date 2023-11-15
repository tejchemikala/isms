package com.example.isms.dao;

import com.example.isms.model.Epr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EprDao extends JpaRepository<Epr,String> {
}
