package com.nikhil.jobpost.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.nikhil.jobpost.entity.JobEntity;

@Repository
public interface JobRepository extends CrudRepository<JobEntity, Integer>{

	@Query("FROM JobEntity j WHERE j.userId=:userId")
	List<JobEntity> getAllJobsForAUser(@Param("userId") Integer userId);
		
}
