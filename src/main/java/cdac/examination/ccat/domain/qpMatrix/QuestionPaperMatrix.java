package cdac.examination.ccat.domain.qpMatrix;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cdac.examination.ccat.domain.BaseEntity;
import cdac.examination.ccat.domain.question.QuestionDisplayOption;
import cdac.examination.ccat.domain.question.QuestionPaperType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("NONE")
@Table(name="QUESTION_PAPER_MATRIX")
public class QuestionPaperMatrix extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="QP_MATRIX_NAME")
	private String name;
	
	@Enumerated(EnumType.STRING)
	private QuestionDisplayOption questionDisplayOption;		//text/image/hybrid type GIVE ENUMERATION
	
	@Enumerated(EnumType.STRING)
	private QuestionPaperType questionPaperType;				// mcq/cdq/desciptive  GIVE ENUMERATION
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="qpMatrix", orphanRemoval=true)
	private List<SectionDetail> sectionDetails;
	
	@Column(name="QUESTION_SHUFFLED")
	private Boolean isQuestionShuffled;
	
	@Column(name="QUESTION_SHUFFLED_WITHIN_SECTION")
	private Boolean isQuestionShuffledWithinSection;
	
	@Column(name="ANSWER_SHUFFLED")
	private Boolean isAnswerShuffled;
	
	@Column(name="TIME_DURATION_IN_MINS")
	private int timeDurationInMinutes;
	
	@Column(name="TIMING_FIXED")
	private Boolean isTimingFixed;
	
	@Column(name="SECTION_REVISIT_ALLOWED")
	private Boolean isSectionRevisitAllowed;
	
	@Column(name="QUESTION_REVISIT_ALLOWED")
	private Boolean isQuestionRevisitAllowed;
	
	@Column(name="ALLOW_ANSWER_UPDATION")
	private Boolean isAnswerUpdationAllowed;

	public QuestionPaperMatrix() {
	}

	public QuestionPaperMatrix(String name,
			QuestionDisplayOption questionDisplayOption,
			QuestionPaperType questionPaperType,
			List<SectionDetail> sectionDetails, Boolean isQuestionShuffled,
			Boolean isQuestionShuffledWithinSection, Boolean isAnswerShuffled,
			int timeDurationInMinutes, Boolean isTimingFixed,
			Boolean isSectionRevisitAllowed, Boolean isQuestionRevisitAllowed,
			Boolean isAnswerUpdationAllowed) {
		this.name = name;
		this.questionDisplayOption = questionDisplayOption;
		this.questionPaperType = questionPaperType;
		this.sectionDetails = sectionDetails;
		this.isQuestionShuffled = isQuestionShuffled;
		this.isQuestionShuffledWithinSection = isQuestionShuffledWithinSection;
		this.isAnswerShuffled = isAnswerShuffled;
		this.timeDurationInMinutes = timeDurationInMinutes;
		this.isTimingFixed = isTimingFixed;
		this.isSectionRevisitAllowed = isSectionRevisitAllowed;
		this.isQuestionRevisitAllowed = isQuestionRevisitAllowed;
		this.isAnswerUpdationAllowed = isAnswerUpdationAllowed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public QuestionDisplayOption getQuestionDisplayOption() {
		return questionDisplayOption;
	}

	public void setQuestionDisplayOption(QuestionDisplayOption questionDisplayOption) {
		this.questionDisplayOption = questionDisplayOption;
	}

		public QuestionPaperType getQuestionPaperType() {
		return questionPaperType;
	}

	public void setQuestionPaperType(QuestionPaperType questionPaperType) {
		this.questionPaperType = questionPaperType;
	}

	public Boolean getIsAnswerUpdationAllowed() {
		return isAnswerUpdationAllowed;
	}

	public void setIsAnswerUpdationAllowed(Boolean isAnswerUpdationAllowed) {
		this.isAnswerUpdationAllowed = isAnswerUpdationAllowed;
	}

		public List<SectionDetail> getSectionDetails() {
		return sectionDetails;
	}

	public void setSectionDetails(List<SectionDetail> sectionDetails) {
		this.sectionDetails = sectionDetails;
	}

	public Boolean getIsQuestionShuffled() {
		return isQuestionShuffled;
	}

	public void setIsQuestionShuffled(Boolean isQuestionShuffled) {
		this.isQuestionShuffled = isQuestionShuffled;
	}

	public Boolean getIsQuestionShuffledWithinSection() {
		return isQuestionShuffledWithinSection;
	}

	public void setIsQuestionShuffledWithinSection(
			Boolean isQuestionShuffledWithinSection) {
		this.isQuestionShuffledWithinSection = isQuestionShuffledWithinSection;
	}

	public Boolean getIsAnswerShuffled() {
		return isAnswerShuffled;
	}

	public void setIsAnswerShuffled(Boolean isAnswerShuffled) {
		this.isAnswerShuffled = isAnswerShuffled;
	}

	public int getTimeDurationInMinutes() {
		return timeDurationInMinutes;
	}

	public void setTimeDurationInMinutes(int timeDurationInMinutes) {
		this.timeDurationInMinutes = timeDurationInMinutes;
	}

	public Boolean getIsTimingFixed() {
		return isTimingFixed;
	}

	public void setIsTimingFixed(Boolean isTimingFixed) {
		this.isTimingFixed = isTimingFixed;
	}

	public Boolean getIsSectionRevisitAllowed() {
		return isSectionRevisitAllowed;
	}

	public void setIsSectionRevisitAllowed(Boolean isSectionRevisitAllowed) {
		this.isSectionRevisitAllowed = isSectionRevisitAllowed;
	}

	public Boolean getIsQuestionRevisitAllowed() {
		return isQuestionRevisitAllowed;
	}

	public void setIsQuestionRevisitAllowed(Boolean isQuestionRevisitAllowed) {
		this.isQuestionRevisitAllowed = isQuestionRevisitAllowed;
	}

}
