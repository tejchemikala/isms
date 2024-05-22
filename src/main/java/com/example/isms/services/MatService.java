package com.example.isms.services;

import com.example.isms.dao.MatDao;
import com.example.isms.model.Mat;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatService {
    @Autowired
    MatDao matDao;
    public List<Mat> getAllMatPairs() {
        return matDao.findAll();
    }

    @Transactional
    public ResponseEntity<String> fill(Mat m) {
        System.out.println(m);
        matDao.save(m);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
