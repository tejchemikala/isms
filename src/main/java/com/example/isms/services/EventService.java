package com.example.isms.services;

import com.example.isms.dao.EventDao;
import com.example.isms.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventService {
    @Autowired
    EventDao eventDao;
    public List<Event> getAllEvents() {
        return eventDao.findAll();
    }
}
