package springmvc.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import springmvc.model.AcademicRecords;
import springmvc.model.Application;
import springmvc.model.ApplicationStatus;
import springmvc.model.Department;
import springmvc.model.EducationalBackground;
import springmvc.model.Programs;
import springmvc.model.StudentInformation;
import springmvc.model.Users;
import springmvc.model.dao.AcademicRecordsDao;
import springmvc.model.dao.ApplicationDao;
import springmvc.model.dao.ApplicationStatusDao;
import springmvc.model.dao.DepartmentDao;
import springmvc.model.dao.EducationalBackgroundDao;
import springmvc.model.dao.ProgramsDao;
import springmvc.model.dao.StudentInformationDao;
@Controller
public class StudentController {
	
	@Autowired
	ApplicationDao applicationDao;
	
	@Autowired
	ProgramsDao prgDao;
	
	@Autowired  
	StudentInformationDao studentDao;
	
	@Autowired
	DepartmentDao departmentDao;
	
	@Autowired
	AcademicRecordsDao acadrecordsDao;
	
	@Autowired
	EducationalBackgroundDao edubackDao;
	
	@Autowired
	ApplicationStatusDao appStatusDao;
	
	@Autowired
	WebApplicationContext context;
	
	@RequestMapping(value = "/studentHome.html")	
	 public String student(ModelMap models, HttpServletRequest request,HttpSession session)
	 {
	    Users user = (Users) session.getAttribute("user");	
	    List<StudentInformation> student = studentDao.getStudentByUserID(user.getId());
    	
    	if(student.size() == 0)
    	{
    		String message = "You have no applications yet !!!";
    		models.put("message", message);
    	}
    	else
    	{
    		/*List<Application> application = applicationDao.getapplicationByStudentID(student.getStuinfoId());
    		models.put("application", application); */
    		models.put("student", student);
    	}
	    return "studenthome";
	    }
	@RequestMapping(value = "GetProgram.html")
	@ResponseBody
    public String programsForApplication(@RequestParam(value = "dpmtID") Integer dpmtID, HttpServletResponse response) throws IOException
    {
		List<Programs> programs = prgDao.getProgramsByDepartmentId(dpmtID);
		String html = "";
		html += "<select name = 'program' id = 'program'>";
			for (Programs program : programs)
			{
				html += "<option value = '"+program.getProgramId()+"'>"+program.getProgramName()+"</option>";
			}
			html += "</select>";
			return html;
    }
	@RequestMapping(value = "/NewApplication.html")
	public String newapplication(ModelMap models, HttpServletRequest request, HttpSession session)
	{
		Users user = (Users) session.getAttribute("user");
		List<Department> departments = departmentDao.getDepartment();
		models.put("departments", departments);
		return "NewApplication";	
	}
	
	@RequestMapping(value = "/NewApplication.html",method = RequestMethod.POST)
	public String newApplication(ModelMap models, HttpServletRequest request, HttpSession session) throws Exception
	{
		
		System.out.println("New Application");
		
		Users users = (Users) session.getAttribute("user");
		int programId = Integer.parseInt(request.getParameter("program"));
		int departmentId = Integer.parseInt(request.getParameter("department"));
		String term = request.getParameter("term");
		//String submittedOn = request.getParameter("submittedOn");
		//SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		//Date date = format.parse(submittedOn);
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String cin = request.getParameter("cin");
		String phone = request.getParameter("phoneno");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = format.parse(dob);
		String citizenship = request.getParameter("citizenship");
		ApplicationStatus status = appStatusDao.getStatusByName("Saved");
		Programs program = prgDao.getProgramsById(programId);
		Application application = new Application();
		application.setTerm(term);
		application.setProgram(program);
		application.setStatus(status);
		application = applicationDao.newApplication(application);
		
		StudentInformation studentInfo;
		
		if(request.getParameter("studentID") != null )
		{
			int studentInfoID = Integer.parseInt(request.getParameter("studentID")); 
			//int id = Integer.parseInt(studentInfoID);
			studentInfo = studentDao.getStudentByID(studentInfoID);			
		}
		else
		{
			studentInfo = new StudentInformation();
		}
		studentInfo.setCin(cin);
		studentInfo.setCitizenship(citizenship);
		studentInfo.setDob(date);
		studentInfo.setfName(firstName);
		studentInfo.setGender(gender);
		studentInfo.setlName(lastName);
		studentInfo.setPhoneNo(phone);
		studentInfo.setId(users);
		Application applications = new Application();
		/*if(((List<StudentInformation>) studentInfo.getApplications()).size()>0){
			applications= studentInfo.getApplications();
		}*/
		studentInfo.setApplications(application);
		studentInfo = studentDao.addStudentInfo(studentInfo);
		session.setAttribute("stuinfoId", studentInfo.getStuinfoId());
		return "redirect:EducationalBackground.html";	
	}
	
	@RequestMapping(value = "EducationalBackground.html",method = RequestMethod.GET)
	public String addEducationalBackground(ModelMap models, HttpSession session)
	{
		return "EducationalBackground";
	
	}
	
	
	
	@RequestMapping(value = "EducationalBackground.html",method = RequestMethod.POST)
	public String addEducationalBackground(ModelMap models, HttpServletRequest request, HttpSession session) throws ParseException
	{
		int studentId = (int) session.getAttribute("stuinfoId");
		
		StudentInformation stuInfo = studentDao.getStudentByID(studentId);
		EducationalBackground edubckgrnd = edubackDao.getStudentByUserID(studentId);
		if(edubckgrnd == null)
		{
			edubckgrnd = new EducationalBackground();
		}
		session.setAttribute("studentId", studentId);
		String degree = request.getParameter("degree");
		String college = request.getParameter("college");
		String university = request.getParameter("university");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		String major = request.getParameter("major");
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = format.parse(startdate);
		Date date1 = format.parse(enddate);
		//StudentInformation studentInfo = studentDao.getStudentByUserID(studentId);
		EducationalBackground edubackground = new EducationalBackground();
		edubackground.setDegreeRecieved(degree);
		edubackground.setCollege(college);
		edubackground.setUniversity(university);
		edubackground.setStartDate(date);
		edubackground.setEndDate(date1);
		edubackground.setMajor(major);
		//List<Application> applications = new ArrayList<Application>();
		List<EducationalBackground> edubackgrounds  = new ArrayList<EducationalBackground>();
		if(stuInfo.getEdubckgrnd().size()>0){
			edubackgrounds= stuInfo.getEdubckgrnd();
		}
		edubackground = edubackDao.addEducationalBackground(edubackground);
		edubackgrounds.add(edubackground);
		stuInfo.setEdubckgrnd(edubackgrounds);
		stuInfo = studentDao.addStudentInfo(stuInfo);
		//models.put("educationalBackgrounds", educationalBackgrounds);
		return "redirect:AcademicRecords.html";	
	}
	
	@RequestMapping(value = "AcademicRecords.html",method = RequestMethod.GET)
	public String addAcademicRecords(ModelMap models, HttpSession session)
	{
		return "AcademicRecords";
	
	}
	
	@RequestMapping(value = "AcademicRecords.html",method = RequestMethod.POST)
	public String addAcademicRecords(ModelMap models, HttpServletRequest request, HttpSession session, @RequestParam MultipartFile file) throws IllegalStateException, IOException
	{
		int studentId = (int) session.getAttribute("stuinfoId");
		List<AcademicRecords> acadrecord = new ArrayList<AcademicRecords>();
		StudentInformation stuInfo = studentDao.getStudentByID(studentId);
		AcademicRecords acadRecords = acadrecordsDao.getStudentByUserID(studentId);
		session.setAttribute("studentId", studentId);
		String toefl = request.getParameter("toefl");
		String gre = request.getParameter("gre");
		String gpa = request.getParameter("gpa");
		String fileName = file.getOriginalFilename();
		AcademicRecords acadrecords = new AcademicRecords();
		acadrecords.setToefl(toefl);
		acadrecords.setGpa(gpa);
		acadrecords.setGre(gre);
		acadrecords.setTranscript(fileName);
		String path = context.getServletContext().getRealPath("/WEB-INF/files/");
		file.transferTo(new File ( new File(path), fileName));
		acadrecords = acadrecordsDao.addAcademicRecords(acadrecords);
		acadrecord.add(acadRecords);
		stuInfo.setAcadrecord(acadrecords);
		stuInfo = studentDao.addStudentInfo(stuInfo);
		acadrecords = acadrecordsDao.addAcademicRecords(acadrecords);
		models.put("acadrecord", acadrecord);
		return "redirect:studentHome.html";	
	}
	

	@RequestMapping(value = "EditApplication/{id}.html",method = RequestMethod.GET)
	public String edit(@PathVariable int id, ModelMap models, HttpServletRequest request, HttpSession session)
	{
		Users user = (Users) session.getAttribute("user");
		StudentInformation studentInfo = null;
		studentInfo = studentDao.getStudentByID(id);
		System.out.println(id);
		Application application = applicationDao.getapplicationByID(studentInfo.getApplications().getAppId());
		int dpmtId = application.getProgram().getDepartment().getDpmtId();
		List<Programs> program = prgDao.getProgramsByDepartmentId(dpmtId);
		session.setAttribute("applicationId", application.getAppId());
		session.setAttribute("departmentId", dpmtId);
		/*session.setAttribute("studentId",id);*/
		
		models.put("application",application);
		models.put("programs", program);
		models.put("studentInfo", studentInfo);
		
		
		
		return "NewApplication";	
	}
	
	@RequestMapping(value = "ViewApplication/{id}.html", method = RequestMethod.GET)
	public String view(@PathVariable Integer id, ModelMap models, HttpServletRequest request, HttpSession session)
	{
		
		StudentInformation studentInfo = studentDao.getStudentByID(id);
		models.put("studentInfo", studentInfo);
		return "ViewApplication";
	}
	@RequestMapping(value = "Submit/{id}.html", method = RequestMethod.GET)
	public String submit(@PathVariable Integer id, ModelMap models, HttpServletRequest request, HttpSession session)
	{
		int studentId = (int) session.getAttribute("stuinfoId");
		StudentInformation studentInfo = studentDao.getStudentByID(id);
		ApplicationStatus status = appStatusDao.getStatusByName("New");
		Date date = new Date();
		studentInfo.getApplications().setStatus(status);
		studentInfo.getApplications().setSubmittedOn(date);
		studentInfo = studentDao.addStudentInfo(studentInfo);
		models.put("studentInfo", studentInfo);
		return "redirect:/studenthome.html";
	}
	@RequestMapping(value = "DownloadFile/{fileName}.html", method = RequestMethod.GET)
	public String viewApplication(@PathVariable String fileName, ModelMap models, HttpSession session, HttpServletResponse response) throws IOException
	{
		response.setContentType( "" );
        response.setHeader( "Content-Disposition",
            "inline; filename="+fileName );
        ServletContext context = session.getServletContext();
        String path = context.getRealPath("/WEB-INF/files");
		FileInputStream in = new FileInputStream(new File(path,fileName));
		OutputStream out = response.getOutputStream();
		byte buffer[] = new byte[2048];
		int bytesRead;
		while ((bytesRead = in.read(buffer)) > 0)
		{
			out.write(buffer, 0, bytesRead);
		}
		in.close();
		return null;
	}

}

