package springmvc.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.AcademicRecords;
import springmvc.model.dao.AcademicRecordsDao;

@Repository
public class AcademicRecordsDaoImpl implements AcademicRecordsDao {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	@Transactional
	public AcademicRecords addAcademicRecords(AcademicRecords acadrecords) {
		return entityManager.merge(acadrecords);
	}

	@Override
	public AcademicRecords getStudentByUserID(int studentId) {
		return null;
	}

}
