package springmvc.model;

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
@Table(name = "additional_info")
public class AdditionalInformation {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer addinfoId;
    
    @ManyToOne
    private Application application;
    
    String value;
    
    @OneToOne
    private AdditionalRequirements addreq;
    
    
    
    public AdditionalInformation()
    {
    }



	public Integer getAddinfoId() {
		return addinfoId;
	}



	public void setAddinfoId(Integer addinfoId) {
		this.addinfoId = addinfoId;
	}



	public Application getApplication() {
		return application;
	}



	public void setApplication(Application application) {
		this.application = application;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public AdditionalRequirements getAddreq() {
		return addreq;
	}



	public void setAddreq(AdditionalRequirements addreq) {
		this.addreq = addreq;
	}


	
}


