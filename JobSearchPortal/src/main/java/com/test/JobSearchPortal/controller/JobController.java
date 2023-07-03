package com.test.JobSearchPortal.controller;

import com.test.JobSearchPortal.model.Job;
import com.test.JobSearchPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    // add job
    @PostMapping("job")
    public String postJob(@RequestBody Job job){
        return jobService.addJob(job);
    }

    // Get All Job By title  ::: custom Query
    @GetMapping("jobs/title")
    public List<Job> getAllJobByTitle(@RequestParam String title){
        return jobService.getAllJob(title);
    }

    // Get By Posted Date ::: custom finder
    @GetMapping("jobs/postedDate")
    public List<Job> getJobByPostedDate(@RequestParam LocalDate date){
        return jobService.getAllJobByDate(date);
    }

    // Delete by id
    @DeleteMapping("job/id/{id}")
    public String removeById(@PathVariable Long id){
        return jobService.deleteJobById(id);
    }

    // update job description by id
    @PutMapping("job/id/description")
    public String updateDescriptionById(@RequestParam Long id,@RequestParam String description){
        return jobService.updateDescription(id,description);
    }
}
