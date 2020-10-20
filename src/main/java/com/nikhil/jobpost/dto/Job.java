package com.nikhil.jobpost.dto;

import com.nikhil.jobpost.entity.JobEntity;

public class Job {

	Integer jobId;
	
	String title;
	
	Integer userId;
	
	public Job() {
		
	}

	public Job(Integer jobId, String title, Integer userId) {
		this.jobId = jobId;
		this.title = title;
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (jobId == null) {
			if (other.jobId != null)
				return false;
		} else if (!jobId.equals(other.jobId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", userId=" + userId + "]";
	}

	public Job createJobFromEntity(JobEntity jobEntity) {
		
		this.jobId = jobEntity.getJobId();
		this.title = jobEntity.getTitle();
		this.userId = jobEntity.getUserId();
		return this;
	}
	
}
