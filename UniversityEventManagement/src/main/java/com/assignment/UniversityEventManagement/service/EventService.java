package com.assignment.UniversityEventManagement.service;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public String postEvent(Event event) {
         eventRepo.save(event);

         return "Added Successfully...!!!!  ::  "+event;
    }

    public List<Event> getAllEventDate(LocalDate date) {
        return eventRepo.findAllByDate(date);
    }

    public String updateEventById(Integer eventId, LocalDate date) {
       Optional<Event> myEventOpt =  eventRepo.findById(eventId);
       Event myEvent= null;
       if(myEventOpt.isPresent()){
           myEvent = myEventOpt.get();
       }else{
           return eventId + "  Id Not Found ....!!!!!";
       }
       myEvent.setDate(date);
       eventRepo.save(myEvent);

       return  "Event Date Is Updated on this id : "+eventId +"  and Date : " +date;
    }


    public String deleteEventById(Integer id) {
        eventRepo.deleteById(id);
        return "Event Deleted Successful  id :: "+id;
    }
}
