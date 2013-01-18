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
import cdac.examination.ccat.domain.qpMatrix.CourseWiseQuestionPaperMatrix;

@Entity
@Table(name="COURSE")
public class Course extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@ManyToOne
	private Exam exam;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Column(name="COURSE_INSTRUCTION")
	private String courseInstruction;
	
	@Column(name="COURSE_CODE")
	private String courseCode;
	
	@Column(name="COURSE_DISPLAY_NAME")
	private String courseDisplayName;
	
	@Column(name="COURSE_DESCRIPTION")
	private String courseDescription;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="course")
	private List<Centre> courseCentres;
	
	@OneToOne(mappedBy="course")
	private CourseWiseQuestionPaperMatrix courseWiseQpMatrix;

	public Course() {
	}

	public Course(Exam exam, String courseName, String courseDescription,
			List<Centre> courseCentres, CourseWiseQuestionPaperMatrix courseWiseQpMatrix, 
			String courseCode, String courseInstruction, String courseDisplayName) {
		this.exam = exam;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseDisplayName = courseDisplayName;
		this.courseInstruction = courseInstruction;
		this.courseDescription = courseDescription;
		this.courseCentres = courseCentres;
		this.courseWiseQpMatrix = courseWiseQpMatrix;
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseInstruction() {
		return courseInstruction;
	}

	public void setCourseInstruction(String courseInstruction) {
		this.courseInstruction = courseInstruction;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseDisplayName() {
		return courseDisplayName;
	}

	public void setCourseDisplayName(String courseDisplayName) {
		this.courseDisplayName = courseDisplayName;
	}

	public List<Centre> getCourseCentres() {
		return courseCentres;
	}

	public void setCourseCentres(List<Centre> courseCentres) {
		this.courseCentres = courseCentres;
	}

	public CourseWiseQuestionPaperMatrix getCourseWiseQpMatrix() {
		return courseWiseQpMatrix;
	}

	public void setCourseWiseQpMatrix(
			CourseWiseQuestionPaperMatrix courseWiseQpMatrix) {
		this.courseWiseQpMatrix = courseWiseQpMatrix;
	}
	
	

}
