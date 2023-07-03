package com.test.JobSearchPortal.repository;

import com.test.JobSearchPortal.model.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IJobRepo  extends CrudRepository<Job,Long> {

    @Query(value = "select * from Job_Portal where title = :title",nativeQuery = true)
       List<Job> getAllJobByTitle(String title);

    public List<Job> findByPostedDate(LocalDate date);

}
