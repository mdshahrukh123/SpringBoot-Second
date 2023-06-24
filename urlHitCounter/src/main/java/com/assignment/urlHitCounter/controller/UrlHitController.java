package com.assignment.urlHitCounter.controller;

import com.assignment.urlHitCounter.modal.Visitor;
import com.assignment.urlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;

    @GetMapping("api/visitor-count-app/id/{id}")
    public Visitor getHitUrlCount(@PathVariable Integer id)  {
        return urlHitService.getHitCount(id);
    }

    @GetMapping("visitor")
    public List<Visitor> getVisitor(){
        return urlHitService.getHitCountVisit();
    }

    @PostMapping("visitor")
    public String addVisitor(@RequestBody Visitor visitor){
        return urlHitService.saveVisitor(visitor);
    }
}
