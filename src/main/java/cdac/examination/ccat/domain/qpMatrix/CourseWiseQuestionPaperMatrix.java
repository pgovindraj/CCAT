package cdac.examination.ccat.domain.qpMatrix;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.exam.Course;

@Entity
@Table(name="COURSE_WISE_QPMATRIX")
@DiscriminatorValue("COURSE_WISE")
public class CourseWiseQuestionPaperMatrix extends QuestionPaperMatrix implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="QP_SLOT_WISE_FIXED")
	private Boolean isQPSlotWiseFixed;
	
	@Column(name="QP_FIXED_FOR_ALL")
	private Boolean isQPFixedForAll;
	
	@OneToOne
	private Course course;

	public CourseWiseQuestionPaperMatrix() {
	}

	public CourseWiseQuestionPaperMatrix(Boolean isQPSlotWiseFixed,
			Boolean isQPFixedForAll, Course course) {
		this.isQPSlotWiseFixed = isQPSlotWiseFixed;
		this.isQPFixedForAll = isQPFixedForAll;
		this.course = course;
	}

	public Boolean getIsQPSlotWiseFixed() {
		return isQPSlotWiseFixed;
	}

	public void setIsQPSlotWiseFixed(Boolean isQPSlotWiseFixed) {
		this.isQPSlotWiseFixed = isQPSlotWiseFixed;
	}

	public Boolean getIsQPFixedForAll() {
		return isQPFixedForAll;
	}

	public void setIsQPFixedForAll(Boolean isQPFixedForAll) {
		this.isQPFixedForAll = isQPFixedForAll;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
