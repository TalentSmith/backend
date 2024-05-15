package com.scrapper.jobBoard.controller;

import com.scrapper.jobBoard.model.Job;
import com.scrapper.jobBoard.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
@CrossOrigin
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/add")
    public String add(@RequestBody Job job){
        jobService.saveJob(job);
        return "New job has been added";
    }
    @GetMapping("/getAllJobs")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }
}
