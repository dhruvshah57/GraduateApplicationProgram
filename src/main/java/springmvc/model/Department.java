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
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer dpmtId;
    
    private String dpmtName;
      
    public Department()
    {
    }

	public Integer getDpmtId() {
		return dpmtId;
	}

	public void setDpmtId(Integer dpmtId) {
		this.dpmtId = dpmtId;
	}

	public String getDpmtName() {
		return dpmtName;
	}


	public void setDpmtName(String dpmtName) {
		this.dpmtName = dpmtName;
	}

}



