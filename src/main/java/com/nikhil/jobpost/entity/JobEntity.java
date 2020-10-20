package com.nikhil.jobpost.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class JobEntity {
	
	@Id
	@Column(name = "job_id")
	private Integer jobId;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne
	private UserEntity userEntity;

	public JobEntity(Integer jobId, String title, UserEntity userEntity) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.userEntity = userEntity;
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

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jobId == null) ? 0 : jobId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((userEntity == null) ? 0 : userEntity.hashCode());
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
		JobEntity other = (JobEntity) obj;
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
		if (userEntity == null) {
			if (other.userEntity != null)
				return false;
		} else if (!userEntity.equals(other.userEntity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JobEntity [jobId=" + jobId + ", title=" + title + ", userEntity=" + userEntity + "]";
	}
	
	

}
