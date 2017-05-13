package springmvc.model.dao;

import java.util.List;

import springmvc.model.Application;
import springmvc.model.Department;
import springmvc.model.StudentInformation;

public interface ApplicationDao {

	List<Application> getApplicationsForDepartment(String department);
	
	List<Application> getApplicationsForStudents (String email);
	
	Application getapplicationByID(int id);

	List<Application> getapplicationByStudentID(int id);
	
	List<Application> createapplication(Application application);

	Application newApplication(Application application);
}
