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

@Entity
@Table(name="SECTION_DETAIL")
public class SectionDetail extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private String id;
	
	@Column(name="SECTION_DIAPLAY_NAME")
	private String sectionDisplayName;
	
	@Column(name="SECTION_TIME_LIMIT_IN_MINS")
	private String sectionTimeLimitInMinutes;
	
	@ManyToOne
	QuestionPaperMatrix qpMatrix;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="sectionDetail", orphanRemoval=true)
	private List<SubSectionDetail> subSectionDetails;

	public SectionDetail() {
	}

	public SectionDetail(String sectionDisplayName,
			String sectionTimeLimitInMinutes, QuestionPaperMatrix qpMatrix,
			List<SubSectionDetail> subSectionDetails) {
		this.sectionDisplayName = sectionDisplayName;
		this.sectionTimeLimitInMinutes = sectionTimeLimitInMinutes;
		this.qpMatrix = qpMatrix;
		this.subSectionDetails = subSectionDetails;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSectionDisplayName() {
		return sectionDisplayName;
	}

	public void setSectionDisplayName(String sectionDisplayName) {
		this.sectionDisplayName = sectionDisplayName;
	}

	public String getSectionTimeLimitInMinutes() {
		return sectionTimeLimitInMinutes;
	}

	public void setSectionTimeLimitInMinutes(String sectionTimeLimitInMinutes) {
		this.sectionTimeLimitInMinutes = sectionTimeLimitInMinutes;
	}

	public QuestionPaperMatrix getQpMatrix() {
		return qpMatrix;
	}

	public void setQpMatrix(QuestionPaperMatrix qpMatrix) {
		this.qpMatrix = qpMatrix;
	}

	public List<SubSectionDetail> getSubSectionDetails() {
		return subSectionDetails;
	}

	public void setSubSectionDetails(List<SubSectionDetail> subSectionDetails) {
		this.subSectionDetails = subSectionDetails;
	}


}
