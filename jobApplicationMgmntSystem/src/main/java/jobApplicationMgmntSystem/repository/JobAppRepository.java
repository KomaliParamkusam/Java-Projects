package jobApplicationMgmntSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jobApplicationMgmntSystem.entity.JobApplication;
 
public interface JobAppRepository extends JpaRepository<JobApplication, Integer>
{
}
