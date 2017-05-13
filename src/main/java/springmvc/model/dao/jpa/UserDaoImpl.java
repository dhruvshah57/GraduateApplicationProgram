package springmvc.model.dao.jpa;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User_Role;
import springmvc.model.Users;
import springmvc.model.dao.UserDao;
import springmvc.model.dao.UserRoleDao;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Users getUser( Integer id )
    {
        return entityManager.find( Users.class, id );
    }

    @Override
    public List<Users> getUsers()
    {
        return entityManager.createQuery( "from Users order by id", Users.class )
            .getResultList();
    }

	@Override
	public Users getUserByEmailIdAndPassword(String email, String password) throws SQLException {
		Users user = null;
		try{
			user = entityManager.createQuery("from Users where emailID=:Email and password=:Password", Users.class).setParameter("Email",email).setParameter("Password", password).getSingleResult();
		}
		catch(NullPointerException e)
		{
			System.out.println("I am here");
		}
		catch(NoResultException e)
		{
			
		}
		if(user != null){
			
		return user;
		}
		else{
		
			return null;
	}
	}

	@Override
	@Transactional
	public Users saveUser(Users user) {
	
		return entityManager.merge(user);
	
	}

}
