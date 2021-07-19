package hrms.Southwind.business.abstracts;

import java.util.List;

import hrms.Southwind.entities.concretes.JobPosition;

public interface JobPositionService {

	public List<JobPosition> getAll();
}
