package com.assignment.UniversityEventManagement.controller;

import com.assignment.UniversityEventManagement.model.Event;
import com.assignment.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    // Add Event
    @PostMapping("event")
    public String addEvent(@RequestBody Event event){
        return eventService.postEvent(event);
    }

    // Get All Event by date through custom finder
    @GetMapping("event/date")
    public List<Event> getAllEventByDate(@RequestParam LocalDate date){
        return eventService.getAllEventDate(date);
    }

    // Update Date of  Event by id
    @PutMapping("event/id/date")
    public String updateEventDateById(@RequestParam Integer eventId, @RequestParam LocalDate date){
        return eventService.updateEventById(eventId,date);
    }

    // Delete Event by id
    @DeleteMapping("event/id/{id}")
    public String removeEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }
}
