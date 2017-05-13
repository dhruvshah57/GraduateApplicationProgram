package springmvc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Programs")
public class Programs {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer programId;
    
    private String programName;
    
    private String requirement;
    @OneToOne
    private Department department;
    
    
    
    public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Programs()
    {
    }


	public Integer getProgramId() {
		return programId;
	}


	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}


	public void setProgramName(String programName) {
		this.programName = programName;
	}


	public String getRequirement() {
		return requirement;
	}


	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

}


