package com.assignment.urlHitCounter.repository;

import com.assignment.urlHitCounter.modal.Visitor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UrlHitRepo {
    List<Visitor> visitorList = new ArrayList<>();

    public List<Visitor> getArrayList() {
        return visitorList;
    }
}
