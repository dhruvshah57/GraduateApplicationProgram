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
@Table(name = "Educational_Background")
public class EducationalBackground {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer edubackId;

    private String degreeRecieved;
    
    private String college;
    
    private String university;
    
    private Date StartDate;
    private Date EndDate;
	public Date getStartDate() {
		return StartDate;
	}


	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}


	private String major;
        
    
    public EducationalBackground()
    {
    }


	public Integer getEdubackId() {
		return edubackId;
	}


	public void setEdubackId(Integer edubackId) {
		this.edubackId = edubackId;
	}


	public String getDegreeRecieved() {
		return degreeRecieved;
	}


	public void setDegreeRecieved(String degreeRecieved) {
		this.degreeRecieved = degreeRecieved;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}

}


