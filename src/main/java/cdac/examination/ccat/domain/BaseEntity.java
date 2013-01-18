package cdac.examination.ccat.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	@Column(name="DATE_OF_CREATION")
	private Date dateOfCreation;
	
	@Column(name="DATE_OF_LAST_UPDATE")
	private Date dateOfLastUpdate;
	
	@Column(name="VALID")
	private Boolean isValid;

	public BaseEntity() {
	}

	public BaseEntity(Date dateOfCreation, Date dateOfLastUpdate, Boolean isValid) {
		this.dateOfCreation = dateOfCreation;
		this.dateOfLastUpdate = dateOfLastUpdate;
		this.isValid = isValid;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Date getDateOfLastUpdate() {
		return dateOfLastUpdate;
	}

	public void setDateOfLastUpdate(Date dateOfLastUpdate) {
		this.dateOfLastUpdate = dateOfLastUpdate;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

}
