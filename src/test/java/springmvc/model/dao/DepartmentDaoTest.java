package springmvc.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@Test(groups = "DepartmentDaoTest")
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DepartmentDaoTest extends AbstractTransactionalTestNGSpringContextTests{

	 @Autowired
	 DepartmentDao departmentDao;
	 
	 /*@Test
	    public void getDepartments()
	    {
	    	//System.out.println(userDao.getUser( 10 ).getFirstName().equalsIgnoreCase( "admin" ));
	        assert departmentDao.getDepartment().size() == 2;
	    }*/
}
