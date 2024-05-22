package com.example.isms.services;

import com.example.isms.dao.EprDao;
import com.example.isms.dao.EventDao;
import com.example.isms.model.Epr;
import com.example.isms.model.Event;
import com.example.isms.model.EventRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class EventService {
    @Autowired
    EventDao eventDao;
    @Autowired
    EprDao eprDao;
    public List<Event> getAllEvents() {
        return eventDao.findAll();
    }

    @Transactional
    public ResponseEntity<String> registerEventData(EventRequest eventRequest) {
        try {
            eventDao.save(eventRequest.event);
            System.out.println(eventRequest.event);
            int id = eventRequest.event.getEventId();
            for (int i = 0; i < eventRequest.eprs.size(); i++) {
                eventRequest.eprs.get(i).setEventId(id);
                System.out.println(eventRequest.eprs.get(i));
                Epr SavedEpr = eprDao.save(eventRequest.eprs.get(i));
                System.out.println(SavedEpr);
            }
            return new ResponseEntity<>("success", HttpStatus.CREATED);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
