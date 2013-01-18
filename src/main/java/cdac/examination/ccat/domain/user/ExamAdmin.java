package cdac.examination.ccat.domain.user;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.exam.Exam;

@Entity
@Table(name="EXAM_ADMIN")
@DiscriminatorValue("EXAM_ADMIN")
public class ExamAdmin extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Exam exam;

	public ExamAdmin() {
	}

	public ExamAdmin(Exam exam) {
		this.exam = exam;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	

}
