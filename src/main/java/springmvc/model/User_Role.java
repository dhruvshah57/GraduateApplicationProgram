package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")

public class User_Role {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    
    private Integer userroleID;
	 private String userroleName;
	public Integer getUserroleID() {
		return userroleID;
	}
	public void setUserroleID(Integer userroleID) {
		this.userroleID = userroleID;
	}
	public String getUserroleName() {
		return userroleName;
	}
	public void setUserroleName(String userroleName) {
		this.userroleName = userroleName;
	}
	 
}
