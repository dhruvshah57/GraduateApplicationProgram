package springmvc.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import springmvc.model.ApplicationStatus;
import springmvc.model.dao.ApplicationStatusDao;


@Repository
public class ApplicationStatusDaoImpl implements ApplicationStatusDao{

	@PersistenceContext 
	EntityManager entityManager;
	
	@Override
	public ApplicationStatus getStatusByName(String name) {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select a from ApplicationStatus a where a.statusName = '"+name+"'",ApplicationStatus.class).getSingleResult();
	}

}
