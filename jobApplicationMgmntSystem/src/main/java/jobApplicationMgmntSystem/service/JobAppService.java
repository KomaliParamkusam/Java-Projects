package jobApplicationMgmntSystem.service;

import jobApplicationMgmntSystem.entity.JobApplication;
import java.util.List;
 
public interface JobAppService
{
	public void saveJobApplication(JobApplication application);
	public List<JobApplication> getAllApplications();
	public void delete(Integer id) ;
}