package cdac.examination.ccat.domain.exam;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import cdac.examination.ccat.domain.BaseEntity;


@Entity
@Table(name="EXAMINEE_RESPONSE")
public class ExamineeResponse extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
  	@GeneratedValue(generator = "system-uuid")
  	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private Long id;
	
	@Column(name="EXAMINEE_ID")
	private Long examineeId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="examineeResponse", orphanRemoval=true)
	private List<DeliveredQuestion> deliveredQuestions;

	public ExamineeResponse() {
	}
	
	public ExamineeResponse(Long examineeId,
			List<DeliveredQuestion> deliveredQuestions) {
		this.examineeId = examineeId;
		this.deliveredQuestions = deliveredQuestions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExamineeId() {
		return examineeId;
	}

	public void setExamineeId(Long examineeId) {
		this.examineeId = examineeId;
	}

	public List<DeliveredQuestion> getDeliveredQuestions() {
		return deliveredQuestions;
	}

	public void setDeliveredQuestions(List<DeliveredQuestion> deliveredQuestions) {
		this.deliveredQuestions = deliveredQuestions;
	}
	

}
