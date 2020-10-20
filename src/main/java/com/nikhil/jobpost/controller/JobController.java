package com.nikhil.jobpost.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.jobpost.dto.Job;

@RestController
@RequestMapping("/api/v1")
public class JobController {
	
	@GetMapping("/getAllJobs")
	public List<Job> getAllJobsForUser(@RequestParam(name = "user_id") String userId) {
		return null;
	}

}
