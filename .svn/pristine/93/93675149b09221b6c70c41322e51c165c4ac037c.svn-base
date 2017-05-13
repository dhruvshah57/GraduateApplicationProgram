package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Application;
import springmvc.model.StudentInformation;
import springmvc.model.dao.ApplicationDao;
@Repository
public class ApplicationDaoImpl implements ApplicationDao{

	@PersistenceContext
    private EntityManager entityManager;

   
	@Override
	public List<Application> getApplicationsForDepartment(String department) {
		
		return entityManager.createQuery("select app from Application app where app.program in (select prog from Programs prog where "
			+ "prog.department.dpmtName = '"+department+"') and app.term = 'Fall 16'",Application.class).getResultList();
	}


	@Override
	public List<Application> getApplicationsForStudents(String email) {
		
		return entityManager.createQuery("select app from Application app where app.studentInfo.id.emailID = '"+email+"'",Application.class).getResultList();
	}


	@Override
	public Application getapplicationByID(int id) {
		return entityManager.find(Application.class, id);
	} 

	@Override
	public List<Application> getapplicationByStudentID(int id){
		return entityManager.createQuery("select a from Application a where a.studentInfo.stuinfoId="+id,Application.class).getResultList();
		
	}


	


	@Override
	public List<Application> createapplication(Application application) {
		return null;
		//return entityManager.createQuery("Insert into Application");
	}

	@Transactional
	@Override
	public Application newApplication(Application application) {
		// TODO Auto-generated method stub
		return entityManager.merge(application);
	}	
	}
