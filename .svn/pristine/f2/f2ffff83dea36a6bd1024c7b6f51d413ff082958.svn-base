package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.Department;
import springmvc.model.dao.DepartmentDao;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{

	 @PersistenceContext
	    private EntityManager entityManager;

	@Override
	public List<Department> getDepartment() {
	
		
		return entityManager.createQuery(" from Department order by id",Department.class).getResultList();
	}
	
	@Override
	public Department getdepartmentByID(int id)
	{
		return entityManager.find(Department.class, id);
	}
	
	@Override
	@Transactional
	public Department addDepartment(Department department)
	{
		return entityManager.merge(department);
	}

	@Override
	@Transactional
	public void saveDepartment(Department department) {
		entityManager.merge(department);
	}
}
