package com.scrapper.jobBoard.service;

import com.scrapper.jobBoard.model.Job;

import java.util.List;

public interface JobService {
    public Job saveJob(Job job);
    public List<Job> getAllJobs();


}
