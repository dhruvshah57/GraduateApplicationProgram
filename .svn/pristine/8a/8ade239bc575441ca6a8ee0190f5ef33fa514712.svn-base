package springmvc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AdditionalReq")
public class AdditionalRequirements {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="add_info_name")
    String addInfoName;
    
    Boolean required;
    String type;
    
    @ManyToOne
    Department dept;
    
   
    
    
    public AdditionalRequirements()
    {
    }




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getAddInfoName() {
		return addInfoName;
	}




	public void setAddInfoName(String addInfoName) {
		this.addInfoName = addInfoName;
	}




	public Boolean getRequired() {
		return required;
	}




	public void setRequired(Boolean required) {
		this.required = required;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public Department getDept() {
		return dept;
	}




	public void setDept(Department dept) {
		this.dept = dept;
	}
    

}




