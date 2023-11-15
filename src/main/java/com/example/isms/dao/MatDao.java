package com.example.isms.dao;

import com.example.isms.model.Mat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatDao extends JpaRepository<Mat,String> {
}
