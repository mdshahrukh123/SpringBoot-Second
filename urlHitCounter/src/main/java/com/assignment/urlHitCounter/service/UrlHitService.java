package com.assignment.urlHitCounter.service;

import com.assignment.urlHitCounter.modal.Visitor;
import com.assignment.urlHitCounter.repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {
    @Autowired
    UrlHitRepo urlHitRepo;

    public Visitor getHitCount(Integer id)  {
        List<Visitor> list = urlHitRepo.getArrayList();
        Visitor visit = null;
        for(Visitor visitor : list){

            if(visitor.getId() == id){

                visitor.setVisitCount(visitor.getVisitCount()+1);
                 visit = visitor;
                 break;
            }
        }

          return visit;


    }

    public String saveVisitor(Visitor visitor) {
        List<Visitor> list = urlHitRepo.getArrayList();

        list.add(visitor);
        return "Visitor Added success...!!!!";
    }

    public List<Visitor> getHitCountVisit() {
        return urlHitRepo.getArrayList();
    }
}
