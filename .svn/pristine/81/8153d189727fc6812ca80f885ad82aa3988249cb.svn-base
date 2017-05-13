package springmvc.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Department;
import springmvc.model.AdditionalRequirements;
import springmvc.model.Programs;
import springmvc.model.dao.DepartmentDao;
import springmvc.model.dao.ProgramsDao;
import springmvc.model.dao.AdditionalRequirementsDao;

@Controller
public class AdditionalfieldController {

	
	
	@Autowired
	ProgramsDao pgmdao;
	
	@Autowired
	DepartmentDao dptdao;
	
	@Autowired
	AdditionalRequirementsDao addfielddao;
	
	@RequestMapping(value = "/newfields.html")
	public String newfields(ModelMap models)
	{
		List<Department> deparments = dptdao.getDepartment();
		models.put("deparmtents", deparments);
		return "newfields";
		
	}
	@RequestMapping(value = "/newfields.html", method= RequestMethod.POST)
	public String addreq(ModelMap models, HttpServletRequest request)
	{
		int dptid =Integer.parseInt(request.getParameter("department"));
		String name = request.getParameter("name");
		AdditionalRequirements addreq = new AdditionalRequirements();
		Department department = dptdao.getdepartmentByID(dptid);
		addreq.setAddInfoName(name);
		addreq.setDept(department);
		addreq = addfielddao.addreq(addreq);
		
		String rediret = "view.html?dpmtId="+dptid;
		return "redirect:"+rediret;
		
	}
}

