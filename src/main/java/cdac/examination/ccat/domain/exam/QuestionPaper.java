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

import cdac.examination.ccat.domain.qpMatrix.SectionDetail;

@Entity
@Table(name="QUESTION_PAPER")
public class QuestionPaper implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="EXAMINEE_ID")
	private Long examineeId;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private List<SectionDetail> sectionDetails;

	public QuestionPaper() {
	}

	public QuestionPaper(Long examineeId, List<SectionDetail> sectionDetails) {
		this.examineeId = examineeId;
		this.sectionDetails = sectionDetails;
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

	public List<SectionDetail> getSectionDetails() {
		return sectionDetails;
	}

	public void setSectionDetails(List<SectionDetail> sectionDetails) {
		this.sectionDetails = sectionDetails;
	}

}
