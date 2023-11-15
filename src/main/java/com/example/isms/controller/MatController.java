package com.example.isms.controller;

import com.example.isms.model.Mat;
import com.example.isms.services.MatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mat")
public class MatController {
    @Autowired
    MatService matService;
    @GetMapping("allMatPairs")
    public List<Mat> getAllMatPairs(){
        return matService.getAllMatPairs();
    }

}
