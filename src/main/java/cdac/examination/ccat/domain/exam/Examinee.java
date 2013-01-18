package cdac.examination.ccat.domain.exam;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.BaseEntity;

@Entity
@Table(name="EXAMINEE")
public class Examinee extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="EXAM_ID")
	private Long examId;
	
	@Column(name="COURSE_ID")
	private Long courseId;
	
	@Column(name="SLOT_ID")
	private Long slotId;
	
	@Column(name="HALL_TICKET_NUMBER")
	private String hallTicketNumber;
	
	@Column(name="EXAM_OVER")
	private Boolean isExamOver;
	
	@OneToOne
	private QuestionPaper qPaper;

	public Examinee() {
	}

	public Examinee(Long examId, Long courseId, Long slotId,
			String hallTicketNumber, Boolean isExamOver, QuestionPaper qPaper) {
		this.examId = examId;
		this.courseId = courseId;
		this.slotId = slotId;
		this.hallTicketNumber = hallTicketNumber;
		this.isExamOver = isExamOver;
		this.qPaper = qPaper;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}

	public String getHallTicketNumber() {
		return hallTicketNumber;
	}

	public void setHallTicketNumber(String hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}

	public Boolean getIsExamOver() {
		return isExamOver;
	}

	public void setIsExamOver(Boolean isExamOver) {
		this.isExamOver = isExamOver;
	}

	public QuestionPaper getqPaper() {
		return qPaper;
	}

	public void setqPaper(QuestionPaper qPaper) {
		this.qPaper = qPaper;
	}
	

}
