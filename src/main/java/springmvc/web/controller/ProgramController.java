package springmvc.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Department;
import springmvc.model.Programs;
import springmvc.model.dao.DepartmentDao;
import springmvc.model.dao.ProgramsDao;

@Controller
public class ProgramController {

	
	
	@Autowired
	ProgramsDao pgmdao;
	
	@Autowired
	DepartmentDao dptdao;
	
	@RequestMapping(value = "/newprogram.html")
	public String newProgram(ModelMap models)
	{
		List<Department> deparments = dptdao.getDepartment();
		models.put("deparmtents", deparments);
		return "newprogram";
		
	}
	@RequestMapping(value = "/newprogram.html", method= RequestMethod.POST)
	public String addProgram(ModelMap models, HttpServletRequest request)
	{
		int dptid =Integer.parseInt(request.getParameter("department"));
		String name = request.getParameter("name");
		Programs program = new Programs();
		Department department = dptdao.getdepartmentByID(dptid);
		program.setProgramName(name);
		program.setDepartment(department);
		program = pgmdao.addProgram(program);
		
		String rediret = "view.html?dpmtId="+dptid;
		return "redirect:"+rediret;
		
	}
}
