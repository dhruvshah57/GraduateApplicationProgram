package springmvc.model.dao;

import java.util.List;

import springmvc.model.EducationalBackground;
import springmvc.model.StudentInformation;

public interface StudentInformationDao {

	List<StudentInformation> getStudentByUserID(int id);

	StudentInformation addStudentInfo(StudentInformation studentinfo);

	EducationalBackground addEducationalBackground(
			EducationalBackground edubackground);

	StudentInformation getStudentByID(int id);
	
}
