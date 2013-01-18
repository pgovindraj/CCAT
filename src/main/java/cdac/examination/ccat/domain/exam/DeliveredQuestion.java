package cdac.examination.ccat.domain.exam;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import cdac.examination.ccat.domain.BaseEntity;

@Entity
@Table(name="DELIVERED_QUESTION")
public class DeliveredQuestion extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID")
	private String id; 
	
	@Column(name="QUESTION_ID")
	private Long questionId;
	
	@Column(name="ANSWER_ID")
	private Long answerId;
	
	@Column(name="SECTION_ID")
	private Long sectionId;
	
	@Column(name="ATTEMPTED")
	private Boolean isAttempted;
	
	@ManyToOne
	ExamineeResponse examineeResponse;
	
	public DeliveredQuestion() {
	}

	public DeliveredQuestion(Long questionId, Long answerId, Long sectionId,
			Boolean isAttempted, ExamineeResponse examineeResponse) {
		this.questionId = questionId;
		this.answerId = answerId;
		this.sectionId = sectionId;
		this.isAttempted = isAttempted;
		this.examineeResponse = examineeResponse;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public Long getSectionId() {
		return sectionId;
	}

	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}

	public Boolean getIsAttempted() {
		return isAttempted;
	}

	public void setIsAttempted(Boolean isAttempted) {
		this.isAttempted = isAttempted;
	}

	public ExamineeResponse getExamineeResponse() {
		return examineeResponse;
	}

	public void setExamineeResponse(ExamineeResponse examineeResponse) {
		this.examineeResponse = examineeResponse;
	}
	
	
	
}
