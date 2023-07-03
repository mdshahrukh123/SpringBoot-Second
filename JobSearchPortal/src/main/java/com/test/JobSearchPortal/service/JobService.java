package com.test.JobSearchPortal.service;

import com.test.JobSearchPortal.model.Job;
import com.test.JobSearchPortal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;

    public String addJob(Job job) {
        jobRepo.save(job);
        return "Added Successful : "+job;
    }
    // custom query
    public List<Job> getAllJob(String title) {
        return jobRepo.getAllJobByTitle(title);
    }

    public List<Job> getAllJobByDate(LocalDate date) {
        return jobRepo.findByPostedDate(date);
    }

    public String deleteJobById(Long id) {
        jobRepo.deleteById(id);
        return " Deleted Successfully....!!!!!";
    }

    public String updateDescription(Long id, String description) {
        Optional<Job> myJobOpt = jobRepo.findById(id);
        Job myJob = null;
        if(myJobOpt.isPresent()){
            myJob = myJobOpt.get();
        }else{
            return "Id not found...!!!!!";
        }
        myJob.setDescription(description);
        jobRepo.save(myJob);
        return "Job Updated Successfully...!!!!";
    }
}
