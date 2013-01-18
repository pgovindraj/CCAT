package cdac.examination.ccat.domain.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE")
@DiscriminatorValue("CANDIDATE")
public class Candidate extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="REGISTRATION_NUMBER")
	private String resgistrationNumber;
	
	@Column(name="HALL_TICKET_NUMBER")
	private String hallTicketNumber;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="GENDER")
	private String gender;

	public Candidate() {
	}

	public Candidate(String resgistrationNumber, String hallTicketNumber,
			String category, String gender) {
		this.resgistrationNumber = resgistrationNumber;
		this.hallTicketNumber = hallTicketNumber;
		this.category = category;
		this.gender = gender;
	}

	public String getResgistrationNumber() {
		return resgistrationNumber;
	}

	public void setResgistrationNumber(String resgistrationNumber) {
		this.resgistrationNumber = resgistrationNumber;
	}

	public String getHallTicketNumber() {
		return hallTicketNumber;
	}

	public void setHallTicketNumber(String hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
