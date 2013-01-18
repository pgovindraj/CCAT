package cdac.examination.ccat.domain.question;

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
@Table(name="SECTION")
public class Section extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	private Section parentSection;
	
	@Column(name="SECTION_NAME")
	private String name;
	
	@Column(name="SECTION_INSTRUCTION")
	private String sectionInstruction;
	
	@Column(name="SECTION_DESCRIPTION")
	private String sectionDescription;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="section", orphanRemoval=true)
	private List<Question> questions;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="parentSection", orphanRemoval=true)
	private List<Section> subSections;

	public Section() {
	}

	public Section(Section parentSection, String name,
			String sectionInstruction, String sectionDescription,
			List<Question> questions, List<Section> subSections) {
		this.parentSection = parentSection;
		this.name = name;
		this.sectionInstruction = sectionInstruction;
		this.sectionDescription = sectionDescription;
		this.questions = questions;
		this.subSections = subSections;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Section getParentSection() {
		return parentSection;
	}

	public void setParentSection(Section parentSection) {
		this.parentSection = parentSection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSectionInstruction() {
		return sectionInstruction;
	}

	public void setSectionInstruction(String sectionInstruction) {
		this.sectionInstruction = sectionInstruction;
	}

	public String getSectionDescription() {
		return sectionDescription;
	}

	public void setSectionDescription(String sectionDescription) {
		this.sectionDescription = sectionDescription;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Section> getSubSections() {
		return subSections;
	}

	public void setSubSections(List<Section> subSections) {
		this.subSections = subSections;
	}

}
