package hrms.Southwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.Southwind.business.abstracts.JobPositionService;
import hrms.Southwind.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/joblist")
public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll() {
		
		return this.jobPositionService.getAll();
		
	}
	
	
	

}
