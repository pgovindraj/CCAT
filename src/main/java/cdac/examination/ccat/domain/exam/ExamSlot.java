package cdac.examination.ccat.domain.exam;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.BaseEntity;
import cdac.examination.ccat.domain.qpMatrix.SlotWiseQuestionPaperMatrix;

@Entity
@Table(name="EXAM_SLOT")
public class ExamSlot extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	private Exam exam;
	
	@ManyToOne
	private Centre centre;
	
	@Column(name="SLOT_NAME")
	private String slotName;
	
	@Column(name="SLOT_CODE")
	private String slotCode;
	
	@Column(name="SLOT_DISPLAY_NAME")
	private String slotDisplayName;
	
	@Column(name="SLOT_START_TIME")
	private Date slotStartTime;
	
	@Column(name="SLOT_END_TIME")
	private Date slotEndTime;
	
	@Column(name="SLOT_ACTIVE")
	private Boolean isActive;
	
	@OneToOne(mappedBy="examSlot")
	private SlotWiseQuestionPaperMatrix slotWiseQpMatrix;

	public ExamSlot() {
	}
	
	public ExamSlot(Exam exam, Centre centre, String slotName, String slotCode,
			String slotDisplayName, Date slotStartTime, Date slotEndTime,
			Boolean isActive, SlotWiseQuestionPaperMatrix slotWiseQpMatrix) {
		this.exam = exam;
		this.centre = centre;
		this.slotName = slotName;
		this.slotCode = slotCode;
		this.slotDisplayName = slotDisplayName;
		this.slotStartTime = slotStartTime;
		this.slotEndTime = slotEndTime;
		this.isActive = isActive;
		this.slotWiseQpMatrix = slotWiseQpMatrix;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}

	public String getSlotName() {
		return slotName;
	}

	public String getSlotCode() {
		return slotCode;
	}

	public void setSlotCode(String slotCode) {
		this.slotCode = slotCode;
	}

	public String getSlotDisplayName() {
		return slotDisplayName;
	}

	public void setSlotDisplayName(String slotDisplayName) {
		this.slotDisplayName = slotDisplayName;
	}

	public Date getSlotEndTime() {
		return slotEndTime;
	}

	public void setSlotEndTime(Date slotEndTime) {
		this.slotEndTime = slotEndTime;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public Date getSlotStartTime() {
		return slotStartTime;
	}

	public void setSlotStartTime(Date slotStartTime) {
		this.slotStartTime = slotStartTime;
	}

	public SlotWiseQuestionPaperMatrix getSlotWiseQpMatrix() {
		return slotWiseQpMatrix;
	}

	public void setSlotWiseQpMatrix(SlotWiseQuestionPaperMatrix slotWiseQpMatrix) {
		this.slotWiseQpMatrix = slotWiseQpMatrix;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
