package com.scrapper.jobBoard.repository;

import com.scrapper.jobBoard.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,String> {

}
