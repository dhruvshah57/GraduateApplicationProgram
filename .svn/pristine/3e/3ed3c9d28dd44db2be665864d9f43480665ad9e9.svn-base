package springmvc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Application")
public class Application {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer appId;
    
    private String term;
    
    private Date submittedOn;
    
    @OneToOne
    private ApplicationStatus status;
    
    public Date getSubmittedOn() {
		return submittedOn;
	}


	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}


	@ManyToOne
    private Programs program;
    
    /*@ManyToOne
    private StudentInformation studentInfo;*/
    
    
    public Application()
    {
    }
    
    
    public Integer getAppId() {
		return appId;
	}


	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getTerm() {
		return term;
	}


	public void setTerm(String term) {
		this.term = term;
	}


	public ApplicationStatus getStatus() {
		return status;
	}


	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}


	public Programs getProgram() {
		return program;
	}


	public void setProgram(Programs program) {
		this.program = program;
	}
/*

	public StudentInformation getStudentInfo() {
		return studentInfo;
	}


	public void setStudentInfo(StudentInformation studentInfo) {
		this.studentInfo = studentInfo;
	}
	*/

}




