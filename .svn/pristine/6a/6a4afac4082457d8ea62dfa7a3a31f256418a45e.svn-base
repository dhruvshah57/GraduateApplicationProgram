package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Programs;
import springmvc.model.dao.ProgramsDao;

@Repository
public class ProgramDaoImpl implements ProgramsDao {

	 @PersistenceContext
	    private EntityManager entityManager;

	@Override
	public List<Programs> getPrograms() {
		
		return entityManager.createQuery(" from Programs order by id",Programs.class).getResultList();
	}
	
	@Override
	public List<Programs> getProgramsByDepartmentId(int dpmtId) {
		return entityManager.createQuery("from Programs p where p.department.dpmtId = "+dpmtId,Programs.class).getResultList();
	}
	
	@Override
	public Programs getProgramsById(int id){
		return entityManager.find(Programs.class, id);
	}
	
	@Override
	@Transactional
	public Programs addProgram(Programs program)
	{
		return entityManager.merge(program);
	}
}
