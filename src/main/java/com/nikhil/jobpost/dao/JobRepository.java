package com.nikhil.jobpost.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nikhil.jobpost.entity.JobEntity;

@Repository
public interface JobRepository extends CrudRepository<JobEntity, Integer>{

	
}
