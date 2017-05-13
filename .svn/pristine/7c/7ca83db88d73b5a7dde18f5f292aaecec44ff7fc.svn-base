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
@Table(name = "Application_Status")
public class ApplicationStatus {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer appstatusId;
    
    private String statusName;
    
    
    
    public ApplicationStatus()
    {
    }


	public Integer getAppstatusId() {
		return appstatusId;
	}


	public void setAppstatusId(Integer appstatusId) {
		this.appstatusId = appstatusId;
	}


	public String getStatusName() {
		return statusName;
	}


	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}



