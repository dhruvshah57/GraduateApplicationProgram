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
@Table(name = "Academic_Records")
public class AcademicRecords {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer acadrecId;

    private String toefl;
    
    private String gpa;
    
    private String gre;

    private String transcript;
    
    
    
    public AcademicRecords()
    {
    }


	public Integer getAcadrecId() {
		return acadrecId;
	}


	public void setAcadrecId(Integer acadrecId) {
		this.acadrecId = acadrecId;
	}


	public String getGpa() {
		return gpa;
	}


	public void setGpa(String gpa) {
		this.gpa = gpa;
	}


	public String getGre() {
		return gre;
	}


	public void setGre(String gre) {
		this.gre = gre;
	}


	public String getTranscript() {
		return transcript;
	}


	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}


	public String getToefl() {
		return toefl;
	}


	public void setToefl(String toefl) {
		this.toefl = toefl;
	}

    

}
