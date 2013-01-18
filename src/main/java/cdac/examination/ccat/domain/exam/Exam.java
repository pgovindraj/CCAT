package cdac.examination.ccat.domain.exam;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.BaseEntity;
import cdac.examination.ccat.domain.user.ExamAdmin;


@Entity
@Table(name="EXAM")
public class Exam extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="EXAM_NAME")
	private String examName;
	
	@Column(name="EXAM_CODE")
	private String examCode;
	
	@Column(name="EXAM_DISPLAY_NAME")
	private String examDisplayName;
	
	@Column(name="EXAM_DESCRIPTION")
	private String examDescription;
	
	@Column(name="CONDUCTING_AGENCY")
	private String conductingAgency;
	
	@Column(name="EXAM_INSTRUCTION")
	private String examInstruction;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="exam")
	private ExamAdmin examAdmin;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="exam", orphanRemoval=true)
	private List<Course> courses;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="exam", orphanRemoval=true)
	private List<ExamSlot> examSlots;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="exam", orphanRemoval=true)
	private List<Centre> examCentres;
	
	@Column(name="EXAM_ACTIVE")
	private Boolean examActive;

	public Exam() {
	}

	public Exam(String examName, String examCode, String examDisplayName,
			String examDescription, String conductingAgency,
			String examInstruction, ExamAdmin examAdmin, List<Course> courses,
			List<ExamSlot> examSlots, List<Centre> examCentres,
			Boolean examActive) {
		this.examName = examName;
		this.examCode = examCode;
		this.examDisplayName = examDisplayName;
		this.examDescription = examDescription;
		this.conductingAgency = conductingAgency;
		this.examInstruction = examInstruction;
		this.examAdmin = examAdmin;
		this.courses = courses;
		this.examSlots = examSlots;
		this.examCentres = examCentres;
		this.examActive = examActive;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getExamDisplayName() {
		return examDisplayName;
	}

	public void setExamDisplayName(String examDisplayName) {
		this.examDisplayName = examDisplayName;
	}

	public String getExamDescription() {
		return examDescription;
	}

	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
	}

	public String getConductingAgency() {
		return conductingAgency;
	}

	public void setConductingAgency(String conductingAgency) {
		this.conductingAgency = conductingAgency;
	}

	public String getExamInstruction() {
		return examInstruction;
	}

	public void setExamInstruction(String examInstruction) {
		this.examInstruction = examInstruction;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<ExamSlot> getExamSlots() {
		return examSlots;
	}

	public void setExamSlots(List<ExamSlot> examSlots) {
		this.examSlots = examSlots;
	}

	public List<Centre> getExamCentres() {
		return examCentres;
	}

	public void setExamCentres(List<Centre> examCentres) {
		this.examCentres = examCentres;
	}

	public ExamAdmin getExamAdmin() {
		return examAdmin;
	}

	public void setExamAdmin(ExamAdmin examAdmin) {
		this.examAdmin = examAdmin;
	}

	public Boolean getExamActive() {
		return examActive;
	}

	public void setExamActive(Boolean examActive) {
		this.examActive = examActive;
	}
	
}
