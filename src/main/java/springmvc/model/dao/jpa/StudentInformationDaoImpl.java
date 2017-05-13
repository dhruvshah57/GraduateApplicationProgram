package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.EducationalBackground;
import springmvc.model.StudentInformation;
import springmvc.model.dao.StudentInformationDao;

@Repository
public class StudentInformationDaoImpl implements StudentInformationDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public StudentInformation getStudentByID(int id)
	{
		return entityManager.find(StudentInformation.class, id);
	}
	
	@Override
	public List<StudentInformation> getStudentByUserID(int id) {
		// TODO Auto-generated method stub
		List<StudentInformation> student;
		try{
		 student = entityManager.createQuery("select s from StudentInformation s where s.id.id="+id,StudentInformation.class).getResultList();
		}
		catch (Exception e)
		{
			student=null;
		}
		return student == null? null : student;
	}

	@Transactional
	@Override
	public StudentInformation addStudentInfo(StudentInformation studentinfo) {
		// TODO Auto-generated method stub
		return entityManager.merge(studentinfo);
	}

	@Override
	public EducationalBackground addEducationalBackground(
			EducationalBackground edubackground) {
		// TODO Auto-generated method stub
		return null;
	}

}
