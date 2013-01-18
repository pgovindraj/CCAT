package cdac.examination.ccat.domain.qpMatrix;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cdac.examination.ccat.domain.BaseEntity;
import cdac.examination.ccat.domain.question.Question;

@Entity
@Table(name="SUB_SECTION_DETAIL")
public class SubSectionDetail extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	private SectionDetail sectionDetail;
	
	@Column(name="SUB_SECTION_DIAPLAY_NAME")
	private String subSectionDisplayName;
	
	@Column(name="SUB_SECTION_TIME_IN_MINS")
	private String subSectionTimeLimitInMinutes;
	
	@Column(name="NO_OF_QUESTIONS")
	private String noOfQuestions;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Question> questions;	//empty while matrix creation but fill while paper creation

	public SubSectionDetail() {
	}

	public SubSectionDetail(SectionDetail sectionDetail,
			String subSectionDisplayName, String subSectionTimeLimitInMinutes,
			String noOfQuestions, List<Question> questions) {
		this.sectionDetail = sectionDetail;
		this.subSectionDisplayName = subSectionDisplayName;
		this.subSectionTimeLimitInMinutes = subSectionTimeLimitInMinutes;
		this.noOfQuestions = noOfQuestions;
		this.questions = questions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SectionDetail getSectionDetail() {
		return sectionDetail;
	}

	public void setSectionDetail(SectionDetail sectionDetail) {
		this.sectionDetail = sectionDetail;
	}

	public String getSubSectionDisplayName() {
		return subSectionDisplayName;
	}

	public void setSubSectionDisplayName(String subSectionDisplayName) {
		this.subSectionDisplayName = subSectionDisplayName;
	}

	public String getSubSectionTimeLimitInMinutes() {
		return subSectionTimeLimitInMinutes;
	}

	public void setSubSectionTimeLimitInMinutes(String subSectionTimeLimitInMinutes) {
		this.subSectionTimeLimitInMinutes = subSectionTimeLimitInMinutes;
	}

	public String getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(String noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
