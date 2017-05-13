package springmvc.web.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.AdditionalRequirements;
import springmvc.model.Department;
import springmvc.model.Programs;
import springmvc.model.dao.AdditionalRequirementsDao;
import springmvc.model.dao.DepartmentDao;
import springmvc.model.dao.ProgramsDao;
import springmvc.model.dao.UserDao;

@Controller
public class AdminController {
	

	@Autowired
	 DepartmentDao departmentDao;
	
	@Autowired
	 ProgramsDao programDao;
	
	@Autowired
	AdditionalRequirementsDao additionalRequirementsDao;
	
	
	
    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public String viewDepartment(ModelMap models)
    {
        List<Department> department = departmentDao.getDepartment();
    	models.put("department", department);
    	
    	List<Programs> program = programDao.getPrograms(); 
    	models.put("Programs", program);
    	
    	return "List";
    }
    @RequestMapping(value = "/view.html")
    public String view(ModelMap models, HttpServletRequest request)
    {
    	int deptID = Integer.parseInt(request.getParameter("dpmtId"));
    	Department departments = departmentDao.getdepartmentByID(deptID);
    	models.put("department",departments);
    	
    	List<Programs> programs = programDao.getProgramsByDepartmentId(deptID);
    	models.put("programs", programs);
    	
    	List<AdditionalRequirements> additionalRequirements = additionalRequirementsDao.getAdditionalRequirementsByDepartmentId(deptID);
    	models.put("AdditionalRequirements", additionalRequirements);
    	return "ViewDepartment";
    }

}
