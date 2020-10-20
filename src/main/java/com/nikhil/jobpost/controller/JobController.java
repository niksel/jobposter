package com.nikhil.jobpost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nikhil.jobpost.dto.Job;
import com.nikhil.jobpost.dto.User;
import com.nikhil.jobpost.exception.UserNotFoundException;
import com.nikhil.jobpost.service.JobService;
import com.nikhil.jobpost.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class JobController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JobService jobService;
	
	@PostMapping("/create/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		
		user = userService.createUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@PostMapping("/create/job")
	public ResponseEntity<Job> createJobForUser(@RequestBody Job job) throws UserNotFoundException {
		
		job = jobService.createJob(job);
		return new ResponseEntity<Job>(job, HttpStatus.CREATED);	
	}
	
	@GetMapping("/getJobs")
	public List<Job> getAllJobsForUser(@RequestParam(name = "user_id") String userId) throws NumberFormatException, UserNotFoundException {
		return jobService.getAllJobsForUser(Integer.parseInt(userId));
	}
	
	@GetMapping("/getAllJobs")
	public List<Job> getAllJobs() {
		return jobService.getAllJobs();
	}

}
