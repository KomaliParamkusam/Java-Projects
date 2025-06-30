package jobApplicationMgmntSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import jobApplicationMgmntSystem.entity.JobApplication;
import jobApplicationMgmntSystem.repository.JobAppRepository;
 
@Service
public class JobAppServiceImpl implements JobAppService
{
	@Autowired
	private JobAppRepository repo;
 
	@Override
	@Transactional
	public void saveJobApplication(JobApplication application) 
	{
		repo.save(application);
	}
 
	@Override
	public List<JobApplication> getAllApplications() 
	{
		return repo.findAll();
	}
	@Transactional
	@Override
	public void delete(Integer id) {
		System.out.println("helo");
	    repo.deleteById(id);
	}

 
}
