package cdac.examination.ccat.domain.exam;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.BaseEntity;
import cdac.examination.ccat.domain.user.CentreSuperintendant;

@Entity
@Table(name="CENTRE")
public class Centre extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	private Exam exam;
	
	@ManyToOne
	private Course course;
	
	@Column(name="CENTRE_NAME")
	private String centreName;
	
	@Column(name="CENTRE_CODE")
	private String centreCode;
	
	@Column(name="CENTRE_DISPLAY_NAME")
	private String centreDisplayName;
	
	@Column(name="CENTRE_INSTRUCTION")
	private String centreInstruction;
	
	@Column(name="CENTRE_ADDRESS")
	private String centreAddress;
	
	@Column(name="CENTRE_CONTACT_NUMBER")
	private String centreContactNo;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="centre")
	private List<ExamSlot> slots;
	
	@OneToOne(mappedBy="centre", orphanRemoval=true)
	private CentreSuperintendant centreSuperintendant;

	public Centre() {
	}

	public Centre(Exam exam, Course course, String centreName,
			String centreCode, String centreDisplayName,
			String centreInstruction, String centreAddress,
			String centreContactNo, List<ExamSlot> slots,
			CentreSuperintendant centreSuperintendant) {
		this.exam = exam;
		this.course = course;
		this.centreName = centreName;
		this.centreCode = centreCode;
		this.centreDisplayName = centreDisplayName;
		this.centreInstruction = centreInstruction;
		this.centreAddress = centreAddress;
		this.centreContactNo = centreContactNo;
		this.slots = slots;
		this.centreSuperintendant = centreSuperintendant;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getCentreName() {
		return centreName;
	}

	public String getCentreCode() {
		return centreCode;
	}

	public void setCentreCode(String centreCode) {
		this.centreCode = centreCode;
	}

	public String getCentreDisplayName() {
		return centreDisplayName;
	}

	public void setCentreDisplayName(String centreDisplayName) {
		this.centreDisplayName = centreDisplayName;
	}

	public String getCentreInstruction() {
		return centreInstruction;
	}

	public void setCentreInstruction(String centreInstruction) {
		this.centreInstruction = centreInstruction;
	}

	public List<ExamSlot> getSlots() {
		return slots;
	}

	public void setSlots(List<ExamSlot> slots) {
		this.slots = slots;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public String getCentreAddress() {
		return centreAddress;
	}

	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}

	public String getCentreContactNo() {
		return centreContactNo;
	}

	public void setCentreContactNo(String centreContactNo) {
		this.centreContactNo = centreContactNo;
	}

	public CentreSuperintendant getCentreSuperintendant() {
		return centreSuperintendant;
	}

	public void setCentreSuperintendant(CentreSuperintendant centreSuperintendant) {
		this.centreSuperintendant = centreSuperintendant;
	}
	
	

}
