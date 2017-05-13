package springmvc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Info")
public class StudentInformation {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer stuinfoId;
    
    public Date getDob() {
		return dob;
	}


	private String fName;
    
    private String lName;

    private String cin;
    
    private Date dob;
    
    private String gender;
    
    public void setDob(Date dob) {
		this.dob = dob;
	}


	private String phoneNo;
    
    private String citizenship;
    
    @OneToOne
    private Users id;
    
    @OneToOne
    private Application applications;
    


	@OneToMany
    private List<EducationalBackground> edubckgrnd;
    
    @OneToOne
    private AcademicRecords acadrecord;
    
    
    
	public Application getApplications() {
		return applications;
	}


	public void setApplications(Application applications) {
		this.applications = applications;
	}


    public StudentInformation()
    {
    }


	public Integer getStuinfoId() {
		return stuinfoId;
	}


	public void setStuinfoId(Integer stuinfoId) {
		this.stuinfoId = stuinfoId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getCitizenship() {
		return citizenship;
	}


	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}


	public Users getId() {
		return id;
	}


	public void setId(Users id) {
		this.id = id;
	}


	public List<EducationalBackground> getEdubckgrnd() {
		return edubckgrnd;
	}


	public void setEdubckgrnd(List<EducationalBackground> edubckgrnd) {
		this.edubckgrnd = edubckgrnd;
	}


	public AcademicRecords getAcadrecord() {
		return acadrecord;
	}


	public void setAcadrecord(AcademicRecords acadrecord) {
		this.acadrecord = acadrecord;
	}


}


