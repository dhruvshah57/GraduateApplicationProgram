package springmvc.model.dao;

import springmvc.model.EducationalBackground;

public interface EducationalBackgroundDao {

	EducationalBackground addEducationalBackground(
			EducationalBackground edubackground);

	EducationalBackground getStudentByUserID(int studentId);

}
