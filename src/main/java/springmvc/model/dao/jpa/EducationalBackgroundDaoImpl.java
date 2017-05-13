package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import springmvc.model.EducationalBackground;
import springmvc.model.dao.EducationalBackgroundDao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EducationalBackgroundDaoImpl implements EducationalBackgroundDao{
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	@Transactional
	public EducationalBackground addEducationalBackground(
			EducationalBackground edubackground) {
		return entityManager.merge(edubackground);
	}

	@Override
	public EducationalBackground getStudentByUserID(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
