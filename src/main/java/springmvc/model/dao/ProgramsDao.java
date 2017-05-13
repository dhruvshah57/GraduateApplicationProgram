package springmvc.model.dao;

import java.util.List;

import springmvc.model.Programs;

public interface ProgramsDao {
 List<Programs> getPrograms();

List<Programs> getProgramsByDepartmentId(int dpmtId);

Programs addProgram(Programs program);

Programs getProgramsById(int id);
}
