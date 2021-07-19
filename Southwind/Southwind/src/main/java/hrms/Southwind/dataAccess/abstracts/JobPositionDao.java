package hrms.Southwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.Southwind.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
