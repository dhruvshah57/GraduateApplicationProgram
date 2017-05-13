package springmvc.model.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import springmvc.model.User_Role;
import springmvc.model.dao.UserRoleDao;

@Repository
public class UserRoleImpl implements UserRoleDao{

	@PersistenceContext
    private EntityManager entityManager;

	@Override	
	public User_Role getRoleById(int id)
	{
		return entityManager.find(User_Role.class, id);
	}
	
}
