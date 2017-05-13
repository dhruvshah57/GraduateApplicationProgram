package springmvc.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import springmvc.model.Department;
import springmvc.model.dao.DepartmentDao;

@Controller
@SessionAttributes("department")
public class DepartmentController {

	@Autowired
	DepartmentDao dtpdao;
	
	@RequestMapping(value = "newdepartment.html")
	public String newDepartment ()
	{
		
		return "newdepartment";
		
	}
	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public String edit(@RequestParam Integer dpmtId, ModelMap models)
	{
		Department department = dtpdao.getdepartmentByID(dpmtId);
		models.put("department", department);
		
		return "edit";
		
	}
	
	@RequestMapping(value = "edit.html", method = RequestMethod.POST)
	public String edit(@RequestParam String name, @RequestParam Integer departmentId)
	{
		Department department = dtpdao.getdepartmentByID(departmentId);
		department.setDpmtName(name);
		dtpdao.saveDepartment(department);
		return "redirect:list.html";
		
	}
	
	@RequestMapping(value = "newdepartment.html",method = RequestMethod.POST)
	public String addDepartment(ModelMap models, HttpServletRequest request)
	{
		//
		String name = request.getParameter("name");
		Department department = new Department();
		department.setDpmtName(name);
		department = dtpdao.addDepartment(department);

		return "redirect:list.html";
		
	}
}
