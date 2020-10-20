package com.nikhil.jobpost.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nikhil.jobpost.dao.JobRepository;
import com.nikhil.jobpost.dao.UserRepository;
import com.nikhil.jobpost.dto.Job;
import com.nikhil.jobpost.entity.JobEntity;
import com.nikhil.jobpost.exception.UserNotFoundException;

@Service
public class JobService {
	
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public Job createJob(Job job) throws UserNotFoundException {
		
		Integer userId = job.getUserId();
		if(!userRepository.existsById(userId))
			throw new UserNotFoundException("User with user id " + userId + " does not exist!");
		JobEntity jobEntity = new JobEntity(job.getJobId(), job.getTitle(), job.getUserId());
		jobRepository.save(jobEntity);
		return job;
		
	}
	
	public List<Job> getAllJobs() {
		
		List<JobEntity> jobEntities = (List<JobEntity>) jobRepository.findAll();
		List<Job> jobs = new ArrayList<>();
		for(JobEntity entity : jobEntities) {
			Job job = new Job(entity.getJobId(), entity.getTitle(), entity.getUserId());
			jobs.add(job);
		}
		return jobs;
	}
	
	public List<Job> getAllJobsForUser(Integer userId) throws UserNotFoundException {
		
		List<JobEntity> jobEntities = jobRepository.getAllJobsForAUser(userId);
		if(!userRepository.existsById(userId))
			throw new UserNotFoundException("User with user id " + userId + " does not exist!");
		List<Job> jobs = new ArrayList<>();
		for(JobEntity entity : jobEntities) {
			Job job = new Job(entity.getJobId(), entity.getTitle(), entity.getUserId());
			jobs.add(job);
		}
		return jobs;
	}

}
