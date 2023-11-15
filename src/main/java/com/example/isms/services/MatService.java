package com.example.isms.services;

import com.example.isms.dao.MatDao;
import com.example.isms.model.Mat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatService {
    @Autowired
    MatDao matDao;
    public List<Mat> getAllMatPairs() {
        return matDao.findAll();
    }
}
